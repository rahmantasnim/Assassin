package endpoints.impl;

import endpoints.GameApi;
import exceptions.rest.verification.RestRequestException;
import models.api.requests.gameapi.JoinGameRequest;
import models.api.requests.gameapi.LeaveGameRequest;
import models.api.requests.gameapi.SetupGameRequest;
import models.api.requests.gameapi.StartGameRequest;
import models.api.responses.gameapi.GameSetupResponse;
import models.api.responses.gameapi.JoinGameResponse;
import models.api.responses.gameapi.LeaveGameResponse;
import models.api.responses.gameapi.StartGameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.VerifyRequest;

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
