package ticketmodeling.domain.audience.identify;

public class AudienceIdentifyException extends RuntimeException {

    public AudienceIdentifyException() {
        super();
    }

    public AudienceIdentifyException(String message) {
        super(message);
    }

    public AudienceIdentifyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AudienceIdentifyException(Throwable cause) {
        super(cause);
    }

}
