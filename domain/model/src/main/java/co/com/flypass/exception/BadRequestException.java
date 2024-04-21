package co.com.flypass.exception;

public class BadRequestException extends CustomException{

    public BadRequestException(String technicalMessage, String userMessage) {
        super(technicalMessage, userMessage);
    }
}
