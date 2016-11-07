package models.api.responses.playerapi;

/**
 * Provides the current game state of living and dead players.
 */
public class GameStateResponse {

    private List<Player> allPlayers;

    public List<Player> getLivingPlayers() {
        return allPlayers;
    }

    public void setLivingPlayers(List<Player> allPlayers) {
        this.allPlayers = allPlayers;
    }
}
