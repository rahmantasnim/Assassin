package mercergroup.assassin.rest.util;

import mercergroup.assassin.core.exceptions.verification.CommonRequestException;
import mercergroup.assassin.core.exceptions.verification.SetupGameRequestException;
import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Test that the verification class throws proper exceptions
 */
@RunWith(SpringRunner.class)
public class TestVerifyRequest {

    private VerifyRequest verifyRequest = new VerifyRequest();

    private static final String EXPECTED_EXCEPTION = "Expected an exception to be thrown";
    private static final String UNEXPECTED_EXCEPTION = "Expected no exceptions";

    @Test
    public void testCommonRequest_BadUserId() {
        CommonRequest request = RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setUserId(-10);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof CommonRequestException);
            assertEquals("Invalid userId", e.getMessage());
        }
    }

    @Test
    public void testCommonRequest_BadGameroomId() {
        CommonRequest request = RequestGenerator.healthyCommonRequest(JoinGameRequest.class);
        request.setGameroomId(-10);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof CommonRequestException);
            assertEquals("Invalid gameroomId", e.getMessage());
        }
    }

    @Test
    public void testCommonRequest_BadPlayerId() {
        CommonRequest request = RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setPlayerId(0);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof CommonRequestException);
            assertEquals("Invalid playerId", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_Success() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        try {
            verifyRequest.verify(request);
            assertTrue(true);
        } catch (Exception e) {
            fail(UNEXPECTED_EXCEPTION);
        }
    }

    @Test
    public void testSetupGameRequest_BadWinCondition() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setWinCondition(0);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("Invalid win condition", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_BadRoomPassword() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setRoomPassword("");
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("No password provided for room", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_BadNPE() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setRoomPassword(null);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("Null pointer found in request", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_BadUpdatePushTimer() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setUpdatePushTimer(-5);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("Invalid push notification timer", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_BadStaleGameTimer() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        request.setStaleGameTimer(0);
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("Stale game is a negative value", e.getMessage());
        }
    }

    @Test
    public void testSetupGameRequest_BadEndDate() {
        SetupGameRequest request = (SetupGameRequest) RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        Date yesterhour = new Date();
        yesterhour.setTime(yesterhour.getTime() - 360000);
        request.setEndDate(yesterhour.getTime());
        try {
            verifyRequest.verify(request);
            fail(EXPECTED_EXCEPTION);
        } catch (Exception e) {
            assertTrue(e instanceof SetupGameRequestException);
            assertEquals("End date must be after today", e.getMessage());
        }
    }




}
