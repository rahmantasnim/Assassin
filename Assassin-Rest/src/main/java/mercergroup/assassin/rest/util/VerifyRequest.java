package mercergroup.assassin.rest.util;

import mercergroup.assassin.core.exceptions.verification.RestRequestException;
import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.LeaveGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.StartGameRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.GameStateRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.KillRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.MyTargetRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * A class that checks that the requests coming in are good requests without an immediate errors.
 */
@Component
public class VerifyRequest {
    static final Logger LOG = LoggerFactory.getLogger(VerifyRequest.class);

    public VerifyRequest() {

    }
    /**
     * Routes the request to the proper verification method
     * @param request
     */
    public void verify(CommonRequest request) {
        LOG.info("Verifying CommonRequest with ID, " + request.getRequestId());

        if (request instanceof KickPlayerRequest) {
            verifyRequest((KickPlayerRequest) request);
        } else if (request instanceof SetupGameRequest) {
            verifyRequest((SetupGameRequest) request);
        } else if (request instanceof JoinGameRequest) {
            verifyRequest((JoinGameRequest) request);
        } else if (request instanceof LeaveGameRequest) {
            verifyRequest((LeaveGameRequest) request);
        } else if (request instanceof StartGameRequest) {
            verifyRequest((StartGameRequest) request);
        } else if (request instanceof GameStateRequest) {
            verifyRequest((GameStateRequest) request);
        } else if (request instanceof KillRequest) {
            verifyRequest((KillRequest) request);
        } else if (request instanceof MyTargetRequest) {
            verifyRequest((MyTargetRequest) request);
        } else {
            LOG.error("Request doesn't map to any current objects", request);
            throw new RestRequestException("Request doesn't map to any current objects");
        }

    }

    private void verifyRequest(KickPlayerRequest request) {

    }

    private void verifyRequest(SetupGameRequest request) {
        LOG.info("Verifying SetupGameRequest with ID, " + request.getRequestId());
    }

    private void verifyRequest(JoinGameRequest request) {

    }

    private void verifyRequest(LeaveGameRequest request) {

    }

    private void verifyRequest(StartGameRequest request) {

    }

    private void verifyRequest(GameStateRequest request) {

    }

    private void verifyRequest(KillRequest request) {

    }

    private void verifyRequest(MyTargetRequest request) {

    }
}
