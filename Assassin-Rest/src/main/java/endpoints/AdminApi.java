package endpoints;

import models.api.requests.adminapi.KickPlayerRequest;
import models.api.responses.adminapi.KickPlayerResponse;

/**
 * An API granting the game admin with additional authority.
 */
public interface AdminApi {

    /**
     * Allows the admin to kick a player from the game
     *
     * @param request
     * @return
     */
    public KickPlayerResponse kickPlayer(KickPlayerRequest request);
}
