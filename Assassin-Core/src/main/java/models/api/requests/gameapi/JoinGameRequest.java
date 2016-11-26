package models.api.requests.gameapi;

import models.api.requests.CommonRequest;

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
}
