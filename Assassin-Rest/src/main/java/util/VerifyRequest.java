package util;

import exceptions.rest.verification.RestRequestException;
import models.api.requests.CommonRequest;
import models.api.requests.adminapi.KickPlayerRequest;
import models.api.requests.gameapi.SetupGameRequest;
import models.api.requests.gameapi.JoinGameRequest;
import models.api.requests.gameapi.LeaveGameRequest;
import models.api.requests.gameapi.StartGameRequest;
import models.api.requests.playerapi.GameStateRequest;
import models.api.requests.playerapi.KillRequest;
import models.api.requests.playerapi.MyTargetRequest;
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
