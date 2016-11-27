package mercergroup.assassin.rest.endpoints.impl;

import mercergroup.assassin.rest.endpoints.AdminApi;
import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.responses.adminapi.KickPlayerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import mercergroup.assassin.rest.util.DefaultVerifyVisitor;

/**
 * Rest API interface for admin to override game state.
 */
@Controller
public class AdminController implements AdminApi {

    @Autowired
    private DefaultVerifyVisitor defaultVerifyVisitor;

    @RequestMapping("/assassin/admin/kickPlayer")
    @ResponseBody
    @Override
    public KickPlayerResponse kickPlayer(KickPlayerRequest request) {
        return null;
    }
}
