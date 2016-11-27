package mercergroup.assassin.core.models.api.requests;

import mercergroup.assassin.core.models.api.requests.adminapi.KickPlayerRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.JoinGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.LeaveGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.SetupGameRequest;
import mercergroup.assassin.core.models.api.requests.gameapi.StartGameRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.GameStateRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.KillRequest;
import mercergroup.assassin.core.models.api.requests.playerapi.MyTargetRequest;

/**
 * interface to use Visitor design pattern
 */
public interface VerifyVisitor {
    public void visit(MyTargetRequest request);
    public void visit(KillRequest request);
    public void visit(GameStateRequest request);
    public void visit(StartGameRequest request);
    public void visit(SetupGameRequest request);
    public void visit(LeaveGameRequest request);
    public void visit(JoinGameRequest request);
    public void visit(KickPlayerRequest request);
}
