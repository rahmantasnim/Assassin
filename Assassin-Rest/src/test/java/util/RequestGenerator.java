package util;

import models.api.requests.CommonRequest;
import models.api.requests.gameapi.SetupGameRequest;

import java.time.LocalDateTime;

/**
 * Creates healthy requests for testing.
 */
public class RequestGenerator {

    public static CommonRequest healthyCommonRequest(Class clazz) {
        CommonRequest commonRequest = null;
        if (SetupGameRequest.class.equals(clazz)) {
            commonRequest = healthySetupGameRequest();
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
        request.setUpdatePushTimer(10);
        request.setStaleGameTimer(0);
        request.setEndDate(LocalDateTime.now().plusDays(2));
        return request;
    }
}
