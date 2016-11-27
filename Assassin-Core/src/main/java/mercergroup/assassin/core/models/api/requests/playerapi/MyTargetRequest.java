package mercergroup.assassin.core.models.api.requests.playerapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;

/**
 * A request by a player to get information about their current target.
 */
public class MyTargetRequest extends CommonRequest {

    @Override
    public void visit(VerifyVisitor visitor) {
        visitor.visit(this);
    }
}
