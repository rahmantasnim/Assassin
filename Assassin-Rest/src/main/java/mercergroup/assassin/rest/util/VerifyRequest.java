package mercergroup.assassin.rest.util;

import mercergroup.assassin.core.exceptions.verification.CommonRequestException;
import mercergroup.assassin.core.exceptions.verification.RestRequestException;
import mercergroup.assassin.core.exceptions.verification.SetupGameRequestException;
import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.LeaveGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.StartGameRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.GameStateRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.KillRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.MyTargetRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * A class that checks that the requests coming in are good requests without an immediate errors.
 */
@Component
public class VerifyRequest {
    private static final Logger LOG = LoggerFactory.getLogger(VerifyRequest.class);

    public static long SECOND = 1000L;
    public static long HOUR = 3600L * SECOND;
    public static long WEEK = 10080L * SECOND;

    public VerifyRequest() {

    }
    /**
     * Routes the request to the proper verification method
     * @param request
     */
    public void verify(CommonRequest request) {
        LOG.info("Verifying CommonRequest with ID, " + request.getRequestId());

        try {
            verifyRequest(request);

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
        } catch (Exception e) {
            LOG.info("Exception caught for request " + request.getRequestId()
                    + ". Exception: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Verifies that the standard properties of a CommonRequest are present and valid
     * @param request
     */
    private void verifyRequest(CommonRequest request) {
        if (request.getRequestId().isEmpty()) {
            throw new CommonRequestException("No unique requestId provided");
        } else if (request.getUserId() <= 0) {
            throw new CommonRequestException("Invalid userId");
        } else if (request.getGameroomId() <= 0
                && !(request instanceof SetupGameRequest)) {
            throw new CommonRequestException("Invalid gameroomId");
        } else if (request.getPlayerId() <= 0) {
            throw new CommonRequestException("Invalid playerId");
        }
    }

    private void verifyRequest(KickPlayerRequest request) {

    }

    /**
     * Verifies that the properties of a SetupGameRequest are present and healthy
     * @param request
     */
    private void verifyRequest(SetupGameRequest request) {
        LOG.info("Verifying SetupGameRequest with ID, " + request.getRequestId());
        Date now = new Date();
        try {
            if (request.getWinCondition() < 1) {
                throw new SetupGameRequestException("Invalid win condition");
            } else if (request.getRoomPassword().isEmpty()) {
                throw new SetupGameRequestException("No password provided for room");
            } else if (request.getUpdatePushTimer() < SECOND || request.getUpdatePushTimer() > WEEK) {
                throw new SetupGameRequestException("Invalid push notification timer");
            } else if (request.getStaleGameTimer() < HOUR) {
                throw new SetupGameRequestException("Stale game is a negative value");
            } else if (request.getEndDate() <= now.getTime()) {
                throw new SetupGameRequestException("End date must be after today");
            }
        } catch (NullPointerException npe) {
            throw new SetupGameRequestException("Null pointer found in request");
        }
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
