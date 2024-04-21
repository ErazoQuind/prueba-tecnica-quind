package co.com.flypass.error;

public class ErrorResponse {

    private String exceptionName;
    private String userMessage;
    private String technicalMessage;

    public ErrorResponse() {
    }

    public ErrorResponse(String exceptionName, String userMessage, String technicalMessage) {
        this.exceptionName = exceptionName;
        this.userMessage = userMessage;
        this.technicalMessage = technicalMessage;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getTechnicalMessage() {
        return technicalMessage;
    }

    public void setTechnicalMessage(String technicalMessage) {
        this.technicalMessage = technicalMessage;
    }

    public static ErrorResponseBuilder builder() {
        return new ErrorResponseBuilder();
    }

    public ErrorResponseBuilder toBuilder() {
        return new ErrorResponseBuilder().exceptionName(this.exceptionName).userMessage(this.userMessage).technicalMessage(this.technicalMessage);
    }


    public static class ErrorResponseBuilder {
        private String exceptionName;
        private String userMessage;
        private String technicalMessage;

        ErrorResponseBuilder() {
        }

        public ErrorResponseBuilder exceptionName(String exceptionName) {
            this.exceptionName = exceptionName;
            return this;
        }

        public ErrorResponseBuilder userMessage(String userMessage) {
            this.userMessage = userMessage;
            return this;
        }

        public ErrorResponseBuilder technicalMessage(String technicalMessage) {
            this.technicalMessage = technicalMessage;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(this.exceptionName, this.userMessage, this.technicalMessage);
        }

        @Override
        public String toString() {
            return "ErrorResponseBuilder{" +
                    "exceptionName='" + exceptionName + '\'' +
                    ", userMessage='" + userMessage + '\'' +
                    ", technicalMessage='" + technicalMessage + '\'' +
                    '}';
        }
    }

}
