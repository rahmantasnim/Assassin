package endpoints;

import models.api.requests.gameapi.SetupGameRequest;
import models.api.requests.gameapi.JoinGameRequest;
import models.api.requests.gameapi.LeaveGameRequest;
import models.api.requests.gameapi.StartGameRequest;
import models.api.responses.gameapi.GameSetupResponse;
import models.api.responses.gameapi.JoinGameResponse;
import models.api.responses.gameapi.LeaveGameResponse;
import models.api.responses.gameapi.StartGameResponse;

/**
 * Interface for the models managing game systems.
 */
public interface GameApi {

    public GameSetupResponse gameSetup (SetupGameRequest request);

    public JoinGameResponse joinGame (JoinGameRequest request);

    public LeaveGameResponse leaveGame (LeaveGameRequest request);

    public StartGameResponse startGame(StartGameRequest request);
}
