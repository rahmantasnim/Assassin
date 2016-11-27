package exceptions.rest.verification;

import mercergroup.assassin.core.exceptions.verification.RestRequestException;

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
