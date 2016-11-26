package mercergroup.assassin.rest.util;

import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bekreth on 11/26/16.
 */
@RunWith(SpringRunner.class)
public class TestVerifyRequest {

    private VerifyRequest verifyRequest = new VerifyRequest();

    @Test
    public void test() {
        verifyRequest.verify(new SetupGameRequest());
        CommonRequest request = new KickPlayerRequest();

        try {
            SetupGameRequest gameState = ((SetupGameRequest) request);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}
