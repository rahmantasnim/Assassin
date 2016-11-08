package models.api.responses.gameapi;

import models.api.responses.CommonResponse;

/**
 * A response to setting up a gameroom.
 */
public class GameSetupResponse extends CommonResponse{

    private int gameroomId;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }
}
