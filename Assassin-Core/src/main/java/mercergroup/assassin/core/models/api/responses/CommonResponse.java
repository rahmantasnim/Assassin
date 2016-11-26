package mercergroup.assassin.core.models.api.responses;

/**
 * Created by bekreth on 11/8/16.
 */
public class CommonResponse {

    private String errorCode;
    private String errorText;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
