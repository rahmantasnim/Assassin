package mercergroup.assassin.core.models.api.requests;

import java.util.UUID;

/**
 * A CommonRequest
 */
public class CommonRequest {

    private int playerId;
    private int gameroomId;
    private final String requestId;

    public CommonRequest() {
        this.requestId = UUID.randomUUID().toString();
    }

    public int getGameroomId() {
        return gameroomId;
    }

    public void setGameroomId(int gameroomId) {
        this.gameroomId = gameroomId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getRequestId() {
        return requestId;
    }
}