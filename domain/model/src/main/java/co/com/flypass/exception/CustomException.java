package co.com.flypass.exception;

public class CustomException extends RuntimeException {
    private final String technicalMessage;
    private final String userMessage;

    public CustomException(String technicalMessage, String userMessage) {
        super(technicalMessage);
        this.technicalMessage = technicalMessage;
        this.userMessage = userMessage;
    }

    public String getTechnicalMessage() {
        return technicalMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
