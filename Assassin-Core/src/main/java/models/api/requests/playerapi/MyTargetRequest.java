package models.api.requests.playerapi;

import models.api.requests.CommonRequest;

/**
 * A request by a player to get information about their current target.
 */
public class MyTargetRequest extends CommonRequest {

    private int gameroomId;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }
}
