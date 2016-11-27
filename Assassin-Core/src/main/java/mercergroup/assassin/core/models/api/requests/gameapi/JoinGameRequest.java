package mercergroup.assassin.core.models.api.requests.gameapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;

/**
 * A request by a user to join a game previously setup by the admin.
 */
public class JoinGameRequest extends CommonRequest {

    private String roomPassword;

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }

    @Override
    public void visit(VerifyVisitor visitor) {
        visitor.visit(this);
    }
}
