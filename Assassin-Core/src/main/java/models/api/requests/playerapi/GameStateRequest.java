package models.api.requests.playerapi;

import models.api.requests.CommonRequest;

/**
 * A request by a player to get the current state of the game.
 */
public class GameStateRequest extends CommonRequest {

    private int gameroomId;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }
}
