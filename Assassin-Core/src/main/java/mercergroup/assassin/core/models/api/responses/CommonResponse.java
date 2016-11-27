package mercergroup.assassin.core.models.api.responses;

import exceptions.rest.verification.RequestErrorCodes;

/**
 * A standard response to be returned from the Assassin backend.
 */
public class CommonResponse {

    private RequestErrorCodes errorCode;
    private String errorText;

    public RequestErrorCodes getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(RequestErrorCodes errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
