package mercergroup.assassin.core.models.api.requests.adminapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;

/**
 * A request sent by admin to kick a player from the game.
 */
public class KickPlayerRequest extends CommonRequest {

    private int kickPlayerId;

    public int getKickPlayerId() {
        return kickPlayerId;
    }

    public void setKickPlayerId(int kickPlayerId) {
        this.kickPlayerId = kickPlayerId;
    }

    @Override
    public void visit(VerifyVisitor visitor) {
        visitor.visit(this);
    }
}
