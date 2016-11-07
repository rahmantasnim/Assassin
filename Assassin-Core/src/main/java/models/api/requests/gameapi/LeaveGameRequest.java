package models.api.requests.gameapi;

/**
 * A request sent by a player to leave a game.
 */
public class LeaveGameRequest {

    private int gameroomId;
    private int userId;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
