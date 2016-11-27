package mercergroup.assassin.core.models.api.requests.playerapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;

/**
 * A request for the user to kill their target
 */
public class KillRequest extends CommonRequest {

    private String killVerification;

    public String getKillVerification() {
        return killVerification;
    }

    public void setKillVerification(String killVerification) {
        this.killVerification = killVerification;
    }

    @Override
    public void visit(VerifyVisitor visitor) {
        visitor.visit(this);
    }
}
