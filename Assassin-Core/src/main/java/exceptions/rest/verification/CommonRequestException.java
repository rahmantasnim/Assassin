package exceptions.rest.verification;

/**
 * Exceptions for error with CommonRequests
 */
public class CommonRequestException extends RestRequestException {
    public CommonRequestException() {
        super();
    }

    public CommonRequestException(String error) {
        super(error);
    }

    public CommonRequestException(String error, Throwable exception) {
        super(error, exception);
    }

    public CommonRequestException(Throwable exception) {
        super(exception);
    }
}
