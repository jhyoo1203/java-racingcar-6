package racingcar.validation;

import racingcar.exception.RacingCarException;
import racingcar.global.constant.RegexPattern;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.global.constant.ErrorMessage.*;
import static racingcar.global.constant.RegexPattern.*;

public class CarNameValidator {

    public void validateEnglishName(String name) {
        if (!isValidPattern(name, ENGLISH_RANGE)) {
            throw new RacingCarException(ERR_CAR_TYPE.getMessage());
        }
    }

    public void validateNoDuplicateNames(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>();
        for (String name : carNames) {
            checkDuplicateName(uniqueNames, name);
        }
    }

    public void validateNoWhitespace(String name) {
        if (isInvalidWhitespace(name)) {
            throw new RacingCarException(ERR_CAR_EMPTY_STRING.getMessage());
        }
    }

    private boolean isValidPattern(String input, RegexPattern pattern) {
        return input != null && input.matches(pattern.getValue());
    }

    private void checkDuplicateName(Set<String> uniqueNames, String name) {
        if (!uniqueNames.add(name)) {
            throw new RacingCarException(ERR_CAR_DUPLICATE.getMessage());
        }
    }

    private boolean isInvalidWhitespace(String name) {
        return name == null || name.trim().isEmpty() || name.matches(WHITESPACE.getValue());
    }
}