package models.api.responses.playerapi;

import models.api.responses.CommonResponse;

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
