package mercergroup.assassin.core.models.api.responses.playerapi;

import mercergroup.assassin.core.models.Player;
import mercergroup.assassin.core.models.api.responses.CommonResponse;

import java.util.List;

/**
 * Provides the current game state of living and dead players.
 */
public class GameStateResponse extends CommonResponse {

    private List<Player> allPlayers;

    public List<Player> getLivingPlayers() {
        return allPlayers;
    }

    public void setLivingPlayers(List<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }
}
