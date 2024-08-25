package racingcar.global.constant;

public enum OutputConstant {

    PRINT_RESULT_MESSAGE("\n실행 결과\n"),
    PRINT_WINNER_MESSAGE("\n최종 우승자: ");

    private final String value;

    OutputConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
