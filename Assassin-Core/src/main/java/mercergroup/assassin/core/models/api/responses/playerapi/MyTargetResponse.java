package mercergroup.assassin.core.models.api.responses.playerapi;

import mercergroup.assassin.core.models.Player;
import mercergroup.assassin.core.models.api.responses.CommonResponse;

/**
 * A response to a MyTargetRequest, providing player with the profile information of their target.
 */
public class MyTargetResponse extends CommonResponse {

    private Player myTarget;

    public Player getMyTarget() {
        return myTarget;
    }

    public void setMyTarget(Player myTarget) {
        this.myTarget = myTarget;
    }

}
