package util;

import models.api.requests.CommonRequest;
import models.api.requests.gameapi.SetupGameRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by bekreth on 11/26/16.
 */
@RunWith(SpringRunner.class)
public class TestVerifyRequest {

    private VerifyRequest verifyRequest = new VerifyRequest();

    @Test
    public void testSetupGameRequest_Success() {
        CommonRequest request = RequestGenerator.healthyCommonRequest(SetupGameRequest.class);
        try {
            verifyRequest.verify(request);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }



}
