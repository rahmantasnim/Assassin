package models.api.requests.gameapi;

/**
 * A request by a user to join a game previously setup by the admin.
 */
public class JoinGameRequest {

    private int gameroomId;
    private String roomPassword;
    private int userId;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
