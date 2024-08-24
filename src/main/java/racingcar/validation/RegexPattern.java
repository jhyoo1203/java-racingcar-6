package racingcar.validation;

public enum RegexPattern {

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