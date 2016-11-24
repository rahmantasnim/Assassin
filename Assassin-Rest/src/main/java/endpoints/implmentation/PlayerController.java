package endpoints.implmentation;

import endpoints.PlayerApi;
import models.api.requests.playerapi.GameStateRequest;
import models.api.requests.playerapi.KillRequest;
import models.api.requests.playerapi.MyTargetRequest;
import models.api.responses.playerapi.GameStateResponse;
import models.api.responses.playerapi.KillResponse;
import models.api.responses.playerapi.MyTargetResponse;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * An implementation of the the PlayerApi interface
 */
@Controller
@EnableAutoConfiguration
public class PlayerController implements PlayerApi {

    @ResponseBody
    @RequestMapping("/assassin/player/kill")
    @Override
    public KillResponse kill(KillRequest request) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/assassin/player/gamestate")
    @Override
    public GameStateResponse getGameState(GameStateRequest request) {
        return null;
    }

    @ResponseBody
    @RequestMapping("/assassin/player/target")
    @Override
    public MyTargetResponse getMyTarget(MyTargetRequest request) {
        return null;
    }
}
