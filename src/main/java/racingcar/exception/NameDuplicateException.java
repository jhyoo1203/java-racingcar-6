package racingcar.exception;

public class NameDuplicateException extends IllegalArgumentException {
    public NameDuplicateException(String message) {
        super(message);
    }
}
