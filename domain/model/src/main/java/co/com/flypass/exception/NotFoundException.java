package co.com.flypass.exception;

public class NotFoundException extends CustomException{

    public NotFoundException(String technicalMessage, String userMessage) {
        super(technicalMessage, userMessage);
    }
}
