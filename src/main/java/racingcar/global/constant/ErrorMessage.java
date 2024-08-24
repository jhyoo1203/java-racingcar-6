package racingcar.global.constant;

public enum ErrorMessage {

    CAR_NAME_TYPE("자동차 이름은 영어여야 합니다."),
    CAR_NAME_DUPLICATE("자동차 이름은 중복될 수 없습니다."),
    CAR_NAME_EMPTY_STRING("자동차 이름을 공백 없이 입력해야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
