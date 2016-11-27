package exceptions.rest.verification;

import mercergroup.assassin.core.exceptions.verification.RestRequestException;

/**
 * Created by bekreth on 11/26/16.
 */
public class SetupGameRequestException extends RestRequestException {
    public SetupGameRequestException() {
        super();
    }

    public SetupGameRequestException(String error) {
        super(error);
    }

    public SetupGameRequestException(String error, Throwable exception) {
        super(error, exception);
    }

    public SetupGameRequestException(Throwable exception) {
        super(exception);
    }
}
