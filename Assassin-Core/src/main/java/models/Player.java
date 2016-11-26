package models;

/**
 * An Object representing a user in game.
 */
public class Player {

    private int playerId;
    private int gameId;
    private Player target;
    private User user;
    private boolean isAlive;
    private String killVerificationCode;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public Player getTarget() {
        return target;
    }

    public void setTarget(Player target) {
        this.target = target;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getKillVerificationCode() {
        return killVerificationCode;
    }

    public void setKillVerificationCode(String killVerificationCode) {
        this.killVerificationCode = killVerificationCode;
    }
}
