package mercergroup.assassin.rest.endpoints;

import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.responses.adminapi.KickPlayerResponse;

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
