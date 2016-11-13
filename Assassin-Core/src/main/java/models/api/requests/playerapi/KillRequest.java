package models.api.requests.playerapi;

import models.api.requests.CommonRequest;

/**
 * A request for the user to kill their target
 */
public class KillRequest extends CommonRequest {

    private int gameroomId;
    private String killVerification;

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }

    public String getKillVerification() {
        return killVerification;
    }

    public void setKillVerification(String killVerification) {
        this.killVerification = killVerification;
    }
}
