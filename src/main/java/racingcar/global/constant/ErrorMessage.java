package racingcar.global.constant;

public enum ErrorMessage {

    ERR_CAR_TYPE("자동차 이름은 영어여야 합니다."),
    ERR_CAR_DUPLICATE("자동차 이름은 중복될 수 없습니다."),
    ERR_CAR_EMPTY_STRING("자동차 이름을 공백 없이 입력해야 합니다."),
    ERR_CAR_NAME_LENGTH("자동차 이름은 1자 이상 5자 이하여야 합니다."),
    ERR_NEGATIVE_NUMBER("입력한 수가 음수일 수 없습니다."),
    ERR_NOT_A_NUMBER("입력값이 숫자가 아닙니다."),
    ERR_EMPTY_INPUT("입력값이 비어 있을 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
