package mercergroup.assassin.rest.endpoints;

import mercergroup.assassin.core.models.api.requests.playerapi.KillRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.GameStateRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.MyTargetRequest;
import mercergroup.assassin.core.models.api.responses.playerapi.KillResponse;
import mercergroup.assassin.core.models.api.responses.playerapi.GameStateResponse;
import mercergroup.assassin.core.models.api.responses.playerapi.MyTargetResponse;

/**
 * An API endpoint for calls made by players during game.
 */
public interface PlayerApi {

    /**
     * A request to mark a target as killed
     * @param request
     * @return
     */
    public KillResponse kill(KillRequest request);

    /**
     * A request to get a list of all living players in the game
     *
     * @param request
     * @return
     */
    public GameStateResponse getGameState(GameStateRequest request);

    /**
     * A request for a player to get their target's profile.
     *
     * @param request
     * @return
     */
    public MyTargetResponse getMyTarget(MyTargetRequest request);

}
