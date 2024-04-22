package co.com.flypass.exception;

public class AlreadyExistException extends CustomException{

    public AlreadyExistException(String technicalMessage, String userMessage) {
        super(technicalMessage, userMessage);
    }
}
