package mercergroup.assassin.core.models.api.requests.gameapi;

import mercergroup.assassin.core.models.api.requests.CommonRequest;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Request to start a new game sent by game admin
 */
public class SetupGameRequest extends CommonRequest {

    private String roomPassword;
    private int winCondition;
    private long updatePushTimer;
    private long staleGameTimer;
    private long endDate;

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }

    public int getWinCondition() {
        return winCondition;
    }

    public void setWinCondition(int winCondition) {
        this.winCondition = winCondition;
    }

    public long getUpdatePushTimer() {
        return updatePushTimer;
    }

    public void setUpdatePushTimer(long updatePushTimer) {
        this.updatePushTimer = updatePushTimer;
    }

    public long getStaleGameTimer() {
        return staleGameTimer;
    }

    public void setStaleGameTimer(long staleGameTimer) {
        this.staleGameTimer = staleGameTimer;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }
}
