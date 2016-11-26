package models.api.requests.gameapi;

import models.api.requests.CommonRequest;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Request to start a new game sent by game admin
 */
public class SetupGameRequest extends CommonRequest {

    private String roomPassword;
    private int winCondition;
    private int updatePushTimer;
    private int staleGameTimer;
    private LocalDateTime endDate;

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

    public int getUpdatePushTimer() {
        return updatePushTimer;
    }

    public void setUpdatePushTimer(int updatePushTimer) {
        this.updatePushTimer = updatePushTimer;
    }

    public int getStaleGameTimer() {
        return staleGameTimer;
    }

    public void setStaleGameTimer(int staleGameTimer) {
        this.staleGameTimer = staleGameTimer;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
