package mercergroup.assassin.core.exceptions.verification;

/**
 * A generic exception created from the rest layer.
 */
public class RestRequestException extends RuntimeException {

    public RestRequestException() {
        super();
    }

    public RestRequestException(String error) {
        super(error);
    }

    public RestRequestException(String error, Throwable exception) {
        super(error, exception);
    }

    public RestRequestException(Throwable exception) {
        super(exception);
    }

}
