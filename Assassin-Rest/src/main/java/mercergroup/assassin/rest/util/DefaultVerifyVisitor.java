package mercergroup.assassin.rest.util;

import mercergroup.assassin.core.exceptions.verification.CommonRequestException;
import mercergroup.assassin.core.exceptions.verification.SetupGameRequestException;
import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.VerifyVisitor;
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
public class DefaultVerifyVisitor implements VerifyVisitor {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultVerifyVisitor.class);

    public static long SECOND = 1000L;
    public static long HOUR = 3600L * SECOND;
    public static long WEEK = 10080L * SECOND;

    /**
     * Verifies that the standard properties of a CommonRequest are present and valid
     * @param request
     */
    private void verifyCommonRequest(CommonRequest request) {
        LOG.info("Verifying CommonRequest with ID, " + request.getRequestId());

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

    @Override
    public void visit(MyTargetRequest request) {
        verifyCommonRequest(request);
    }

    @Override
    public void visit(KillRequest request) {
        verifyCommonRequest(request);

    }

    @Override
    public void visit(GameStateRequest request) {
        verifyCommonRequest(request);

    }

    @Override
    public void visit(StartGameRequest request) {
        verifyCommonRequest(request);

    }

    /**
     * Verifies that the properties of a SetupGameRequest are present and healthy
     * @param request
     */
    @Override
    public void visit(SetupGameRequest request) {
        verifyCommonRequest(request);

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

    @Override
    public void visit(LeaveGameRequest request) {
        verifyCommonRequest(request);

    }

    @Override
    public void visit(JoinGameRequest request) {
        verifyCommonRequest(request);

    }

    @Override
    public void visit(KickPlayerRequest request) {
        verifyCommonRequest(request);

    }
}
