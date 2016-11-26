package endpoints.impl;

import endpoints.GameApi;
import models.api.requests.gameapi.GameSetupRequest;
import models.api.requests.gameapi.JoinGameRequest;
import models.api.requests.gameapi.LeaveGameRequest;
import models.api.requests.gameapi.StartGameRequest;
import models.api.responses.gameapi.GameSetupResponse;
import models.api.responses.gameapi.JoinGameResponse;
import models.api.responses.gameapi.LeaveGameResponse;
import models.api.responses.gameapi.StartGameResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bekreth on 11/25/16.
 */
@Controller
public class GameController implements GameApi {

    @RequestMapping("/assassin/game/setup")
    @ResponseBody
    @Override
    public GameSetupResponse gameSetup(GameSetupRequest request) {
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
