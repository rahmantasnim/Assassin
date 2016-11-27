package mercergroup.assassin.rest.util;



import mercergroup.assassin.core.models.api.requests.CommonRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;

import java.util.Date;

/**
 * Creates healthy requests for testing.
 */
public class RequestGenerator {

    public static CommonRequest healthyCommonRequest(Class clazz) {
        CommonRequest commonRequest = null;
        if (SetupGameRequest.class.equals(clazz)) {
            commonRequest = healthySetupGameRequest();
        } else if (JoinGameRequest.class.equals(clazz)) {
            commonRequest = healthyJoinGameRequest();
        }
        commonRequest.setPlayerId(1);
        commonRequest.setGameroomId(15);
        commonRequest.setUserId(21);
        return commonRequest;
    }

    private static SetupGameRequest healthySetupGameRequest() {
        SetupGameRequest request = new SetupGameRequest();
        request.setPlayerId(1);
        request.setWinCondition(2);
        request.setRoomPassword("password");
        request.setUpdatePushTimer(DefaultVerifyVisitor.HOUR);
        request.setStaleGameTimer(DefaultVerifyVisitor.WEEK);
        Date nextWeek = new Date();
        nextWeek.setTime(nextWeek.getTime() + DefaultVerifyVisitor.WEEK);
        request.setEndDate(nextWeek.getTime());
        return request;
    }

    private static JoinGameRequest healthyJoinGameRequest() {
        JoinGameRequest request = new JoinGameRequest();
        request.setRoomPassword("password");
        return request;
    }
}
