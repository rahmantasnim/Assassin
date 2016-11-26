package endpoints.impl;

import endpoints.AdminApi;
import models.api.requests.adminapi.KickPlayerRequest;
import models.api.responses.adminapi.KickPlayerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.VerifyRequest;

/**
 * Rest API interface for admin to override game state.
 */
@Controller
public class AdminController implements AdminApi {

    @Autowired
    private VerifyRequest verifyRequest;

    @RequestMapping("/assassin/admin/kickPlayer")
    @ResponseBody
    @Override
    public KickPlayerResponse kickPlayer(KickPlayerRequest request) {
        return null;
    }
}
