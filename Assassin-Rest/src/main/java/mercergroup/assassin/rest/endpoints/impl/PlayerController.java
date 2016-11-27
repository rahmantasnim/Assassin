package mercergroup.assassin.rest.endpoints.impl;

import mercergroup.assassin.rest.endpoints.PlayerApi;
import mercergroup.assassin.core.models.api.requests.playerapi.GameStateRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.KillRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.MyTargetRequest;
import mercergroup.assassin.core.models.api.responses.playerapi.GameStateResponse;
import mercergroup.assassin.core.models.api.responses.playerapi.KillResponse;
import mercergroup.assassin.core.models.api.responses.playerapi.MyTargetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import mercergroup.assassin.rest.util.VerifyRequest;

/**
 * Created by bekreth on 11/25/16.
 */
@Controller
public class PlayerController implements PlayerApi {

    @Autowired
    private VerifyRequest verifyRequest;

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
