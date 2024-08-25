package racingcar.global.constant;

public enum InputConstant {

    INPUT_CARS("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n"),
    INPUT_TRY("시도할 회수는 몇회인가요?\n");

    private final String value;

    InputConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
