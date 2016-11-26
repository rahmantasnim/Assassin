package mercergroup.assassin.core.models;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;

/**
 * Object for the game state
 */
public class Game {
    private int gameId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Collection<Player> players;
    private Player admin;
    private LocalTime staleTime;
    private int winLimit;


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public LocalTime getStaleTime() {
        return staleTime;
    }

    public void setStaleTime(LocalTime staleTime) {
        this.staleTime = staleTime;
    }

    public int getWinLimit() {
        return winLimit;
    }

    public void setWinLimit(int winLimit) {
        this.winLimit = winLimit;
    }

    public Player getAdmin() {
        return admin;
    }

    public void setAdmin(Player admin) {
        this.admin = admin;
    }
}
