package mercergroup.assassin.rest.endpoints.impl;

import mercergroup.assassin.rest.endpoints.GameApi;
import mercergroup.assassin.core.exceptions.verification.RestRequestException;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.LeaveGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.StartGameRequest;
import mercergroup.assassin.core.models.api.responses.gameapi.GameSetupResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.JoinGameResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.LeaveGameResponse;
import mercergroup.assassin.core.models.api.responses.gameapi.StartGameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import mercergroup.assassin.rest.util.VerifyRequest;

/**
 * Rest api used to access Gamestate information.
 */
@Controller
public class GameController implements GameApi {

    @Autowired
    private VerifyRequest verifyRequest;

    @RequestMapping("/assassin/game/setup")
    @ResponseBody
    @Override
    public GameSetupResponse gameSetup(SetupGameRequest request) {

        try {
            verifyRequest.verify(request);
        } catch (RestRequestException exceptions) {

        }
        return null;
    }

    @RequestMapping("/assassin/game/join")
    @ResponseBody
    @Override
    public JoinGameResponse joinGame(JoinGameRequest request) {
        return null;
    }

    @RequestMapping("/assassin/game/leave")
    @ResponseBody
    @Override
    public LeaveGameResponse leaveGame(LeaveGameRequest request) {
        return null;
    }

    @RequestMapping("/assassin/game/start")
    @ResponseBody
    @Override
    public StartGameResponse startGame(StartGameRequest request) {
        return null;
    }
}
