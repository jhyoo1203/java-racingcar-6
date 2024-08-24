package racingcar.validation;

import racingcar.exception.EmptyStringArgumentException;
import racingcar.exception.EnglishFormatException;
import racingcar.exception.NameDuplicateException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.global.constant.ErrorMessage.*;

public class CarNameValidator {

    public void validateEnglishName(String name) {
        if (!isValidEnglishName(name)) {
            throw new EnglishFormatException(CAR_NAME_TYPE.getMessage());
        }
    }

    private boolean isValidEnglishName(String name) {
        return name != null && name.matches("[a-zA-Z]+");
    }

    public void validateNoDuplicateNames(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>();
        for (String name : carNames) {
            checkDuplicateName(uniqueNames, name);
        }
    }

    private void checkDuplicateName(Set<String> uniqueNames, String name) {
        if (!uniqueNames.add(name)) {
            throw new NameDuplicateException(CAR_NAME_DUPLICATE.getMessage());
        }
    }

    public void validateNoWhitespace(String name) {
        if (isInvalidWhitespace(name)) {
            throw new EmptyStringArgumentException(CAR_NAME_EMPTY_STRING.getMessage());
        }
    }

    private boolean isInvalidWhitespace(String name) {
        return name == null || name.trim().isEmpty() || name.contains(" ");
    }
}