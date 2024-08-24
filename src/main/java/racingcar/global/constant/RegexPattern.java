package racingcar.global.constant;

public enum RegexPattern {

    NUMBER_RANGE("[1-9]+"),
    ENGLISH_RANGE("[a-zA-Z]+"),
    WHITESPACE("\\s+");

    private final String value;

    RegexPattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}