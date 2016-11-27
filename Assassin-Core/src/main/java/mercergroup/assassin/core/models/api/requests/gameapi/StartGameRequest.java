package mercergroup.assassin.core.models.api.requests.gameapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;

/**
 * Triggers the game to begin
 */
public class StartGameRequest extends CommonRequest {

    private String roomPassword;

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }
}
