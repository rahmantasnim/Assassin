package models.api.requests.playerapi;

/**
 * Created by bekreth on 11/6/16.
 */
public class KillRequest {

    private int gameroomId;
    private int userId;
    private String killVerification;

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

    public String getKillVerification() {
        return killVerification;
    }

    public void setKillVerification(String killVerification) {
        this.killVerification = killVerification;
    }
}
