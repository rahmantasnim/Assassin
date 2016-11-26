package endpoints.impl;

import endpoints.GameApi;
import exceptions.rest.verification.CommonRequestException;
import exceptions.rest.verification.RequestErrorCodes;
import exceptions.rest.verification.RestRequestException;
import exceptions.rest.verification.SetupGameRequestException;
import models.api.requests.gameapi.JoinGameRequest;
import models.api.requests.gameapi.LeaveGameRequest;
import models.api.requests.gameapi.SetupGameRequest;
import models.api.requests.gameapi.StartGameRequest;
import models.api.responses.gameapi.GameSetupResponse;
import models.api.responses.gameapi.JoinGameResponse;
import models.api.responses.gameapi.LeaveGameResponse;
import models.api.responses.gameapi.StartGameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.VerifyRequest;

/**
 * Rest api used to access Gamestate information.
 */
@Controller
public class GameController implements GameApi {

    @Autowired
    private VerifyRequest verifyRequest;

    @RequestMapping("/assassin/game/setup")
    @ResponseBody
    @Override
    public GameSetupResponse gameSetup(SetupGameRequest request) {
        GameSetupResponse response = null;
        try {
            verifyRequest.verify(request);
            response = new GameSetupResponse(); // TODO: 11/26/16 Call service layer
        } catch (RestRequestException exception) {
            // Catches any expected errors and writes them into response
            response = new GameSetupResponse();
            response.setErrorText(exception.getMessage());
            if (exception instanceof SetupGameRequestException) {
                response.setErrorCode(RequestErrorCodes.INVALID_REQUEST);
            } else if (exception instanceof CommonRequestException) {
                response.setErrorCode(RequestErrorCodes.MISSING_COMMON_REQUEST_PARAMS);
            }
        } catch (Exception exception) {
            // Catches unexpected errors and writes them into response
            response = new GameSetupResponse();
            response.setErrorText("Unexpected System error has occurred");
            response.setErrorCode(RequestErrorCodes.UNEXPECTED_SYSTEM_ERROR);
        } finally {
            return response;
        }
    }

    @RequestMapping("/assassin/game/join")
    @ResponseBody
    @Override
    public JoinGameResponse joinGame(JoinGameRequest request) {
        return null;
    }

    @RequestMapping("/assassin/game/leave")
    @ResponseBody
    @Override
    public LeaveGameResponse leaveGame(LeaveGameRequest request) {
        return null;
    }

    @RequestMapping("/assassin/game/start")
    @ResponseBody
    @Override
    public StartGameResponse startGame(StartGameRequest request) {
        return null;
    }
}
