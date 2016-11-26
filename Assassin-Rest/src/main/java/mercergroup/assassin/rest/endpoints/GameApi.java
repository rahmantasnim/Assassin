package mercergroup.assassin.rest.endpoints;

import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.LeaveGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.StartGameRequest;
import mercergroup.assassin.core.models.api.responses.gameapi.GameSetupResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.JoinGameResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.LeaveGameResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.StartGameResponse;

/**
 * Interface for the mercergroup.assassin.models managing game systems.
 */
public interface GameApi {

    public GameSetupResponse gameSetup (SetupGameRequest request);

    public JoinGameResponse joinGame (JoinGameRequest request);

    public LeaveGameResponse leaveGame (LeaveGameRequest request);

    public StartGameResponse startGame(StartGameRequest request);
}
