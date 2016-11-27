package mercergroup.assassin.core.models.api.requests.gameapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;

/**
 * A request sent by a player to leave a game.
 */
public class LeaveGameRequest extends CommonRequest {

    @Override
    public void visit(VerifyVisitor visitor) {
        visitor.visit(this);
    }
}
