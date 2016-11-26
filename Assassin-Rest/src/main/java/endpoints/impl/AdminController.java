package endpoints.impl;

import endpoints.AdminApi;
import models.api.requests.adminapi.KickPlayerRequest;
import models.api.responses.adminapi.KickPlayerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bekreth on 11/25/16.
 */
@Controller
public class AdminController implements AdminApi {

    @RequestMapping("/assassin/admin/kickPlayer")
    @ResponseBody
    @Override
    public KickPlayerResponse kickPlayer(KickPlayerRequest request) {
        return null;
    }
}
