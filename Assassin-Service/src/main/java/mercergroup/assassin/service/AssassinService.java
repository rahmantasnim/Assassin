package mercergroup.assassin.service;

import mercergroup.assassin.core.models.Game;
import mercergroup.assassin.core.models.Player;

public interface AssassinService {
    /**
     * Returns current game info
     * @param gameId int of gameId
     * @return Game
     */
    public Game getGameInfo(int gameId);

    /**
     * Creates a new game with the user requesting it as an admin
     * @param userId user requesting to create a new game
     * @param password password for entering the game
     * @param startTime epoch time in seconds for when the game starts
     * @param endTime epoch time in seconds for when the game ends
     * @param staleTime seconds time limit for when targets get shuffled
     * @param winLimit remaning players left for win condition
     * @return returns a newly created game
     */
    public Game createNewGame(int userId, String password, long startTime, long endTime, long staleTime, int winLimit);

    /**
     * Joins a user to a game and returns a player object
     * @param userId user requesting to join game
     * @param gameId the gameId of the game being joined
     * @param password the password to join the game
     * @return created player object
     */
    public Player joinGame(int userId, int gameId, String password);

    /**
     * The admin kicks a specified player id from a game
     * @param gameId game in which the player is being kicked from
     * @param playerId player being kicked
     * @return the new game state
     */
    public Game kickPlayer(int gameId, int playerId);

    /**
     * A player kills their target
     * @param gameId game in which the kill ocurred
     * @param killerPlayerId the killer player id
     * @param targetPlayerId the player killed
     * @param killVerificationCode the target's kill code
     * @return The new target for the killer
     */
    public Player killPlayer(int gameId, int killerPlayerId, int targetPlayerId, int killVerificationCode );
}
