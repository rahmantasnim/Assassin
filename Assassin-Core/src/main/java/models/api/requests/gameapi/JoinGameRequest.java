package models.api.requests.gameapi;

import models.api.requests.CommonRequest;

/**
 * A request by a user to join a game previously setup by the admin.
 */
public class JoinGameRequest extends CommonRequest {

    private int gameroomId;
    private String roomPassword;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }
}
