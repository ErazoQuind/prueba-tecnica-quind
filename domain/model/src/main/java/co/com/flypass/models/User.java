package co.com.flypass.models;


public class User {
    private Long id;
    private String identificationType;
    private Long identificationNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String dateOfBirth;
    private String creationDate;
    private String modificationDate;

    public Long getId() {
        return id;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

    public ClientBuilder toBuilder() {
        return new ClientBuilder()
                .id(this.id)
                .identificationType(this.identificationType)
                .identificationNumber(this.identificationNumber)
                .firstName(this.firstName)
                .lastName(this.lastName)
                .emailAddress(this.emailAddress)
                .dateOfBirth(this.dateOfBirth)
                .creationDate(this.creationDate)
                .modificationDate(this.modificationDate);
    }


    public static class ClientBuilder {
        private Long id;
        private String identificationType;
        private Long identificationNumber;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private String dateOfBirth;
        private String creationDate;
        private String modificationDate;

        ClientBuilder() {
        }

        public ClientBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ClientBuilder identificationType(String identificationType) {
            this.identificationType = identificationType;
            return this;
        }

        public ClientBuilder identificationNumber(Long identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }

        public ClientBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClientBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClientBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public ClientBuilder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public ClientBuilder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public ClientBuilder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        public User build() {
            User user;
            user = new User();
            user.id = this.id;
            user.identificationType = this.identificationType;
            user.identificationNumber =  this.identificationNumber;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.emailAddress = this.emailAddress;
            user.dateOfBirth = this.dateOfBirth;
            user.creationDate = this.creationDate;
            user.modificationDate = this.modificationDate;
            return user;
        }
    }
}
