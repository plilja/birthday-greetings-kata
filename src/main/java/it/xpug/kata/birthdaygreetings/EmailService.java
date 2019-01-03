package it.xpug.kata.birthdaygreetings;

public interface EmailService {

    void sendEmail(String sender, String subject, String body, String recipient) throws EmailServiceException;

    class EmailServiceException extends RuntimeException {
        public EmailServiceException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

}
