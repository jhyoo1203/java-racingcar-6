package racingcar.validation;

import racingcar.exception.RacingCarException;

import static racingcar.global.constant.ErrorMessage.*;

public class UserInputValidator {

    public void validateNotNegativeNumber(int number) {
        if (isNegativeNumber(number)) {
            throw new RacingCarException(ERR_NEGATIVE_NUMBER.getMessage());
        }
    }

    public void validateIsNumber(String input) {
        if (!isNumber(input)) {
            throw new RacingCarException(ERR_NOT_A_NUMBER.getMessage());
        }
    }

    public void validateNotEmptyInput(String input) {
        if (isEmptyInput(input)) {
            throw new RacingCarException(ERR_EMPTY_INPUT.getMessage());
        }
    }

    private boolean isNegativeNumber(int number) {
        return number < 0;
    }

    private boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isEmptyInput(String input) {
        return input == null || input.trim().isEmpty();
    }
}