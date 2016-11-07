package models.api.requests.gameapi;

import java.util.Date;

/**
 * Request to start a new game sent by game admin
 */
public class GameSetupRequest {
    private String roomPassword;
    private int winCondition;
    private long updatePushTimer;
    private long staleGameTimer;
    private Date endDate;
    private int adminUserId;

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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(int adminUserId) {
        this.adminUserId = adminUserId;
    }
}
