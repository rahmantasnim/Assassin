package models.api.requests.gameapi;

import models.api.requests.CommonRequest;

/**
 * A request sent by a player to leave a game.
 */
public class LeaveGameRequest extends CommonRequest {

    private int gameroomId;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }

}
