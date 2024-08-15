package server.domain.ui;

import server.server.domain.ServerController;

public interface ServerView {
    void showMessage(String message);
    void setServerController(ServerController serverController);
}
