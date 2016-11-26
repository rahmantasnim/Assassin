package endpoints.impl;

import endpoints.PlayerApi;
import models.api.requests.playerapi.GameStateRequest;
import models.api.requests.playerapi.KillRequest;
import models.api.requests.playerapi.MyTargetRequest;
import models.api.responses.playerapi.GameStateResponse;
import models.api.responses.playerapi.KillResponse;
import models.api.responses.playerapi.MyTargetResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bekreth on 11/25/16.
 */
@Controller
public class PlayerController implements PlayerApi {

    @RequestMapping("/assassin/player/kill")
    @ResponseBody
    @Override
    public KillResponse kill(KillRequest request) {
        return null;
    }

    @RequestMapping("/assassin/player/state")
    @ResponseBody
    @Override
    public GameStateResponse getGameState(GameStateRequest request) {
        return null;
    }

    @RequestMapping("/assassin/player/target")
    @ResponseBody
    @Override
    public MyTargetResponse getMyTarget(MyTargetRequest request) {
        return null;
    }
}
