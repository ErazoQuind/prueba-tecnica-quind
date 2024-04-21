package co.com.flypass.exception;


public class ValidationException extends CustomException {
    public ValidationException(String technicalMessage, String userMessage) {
        super(technicalMessage, userMessage);
    }
}
