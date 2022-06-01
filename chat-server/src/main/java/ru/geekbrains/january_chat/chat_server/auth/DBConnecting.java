package ru.geekbrains.january_chat.chat_server.auth;

import ru.geekbrains.january_chat.chat_server.db.ClientsDB;
import ru.geekbrains.january_chat.chat_server.entity.User;

public class DBConnecting implements AuthService {

    private ClientsDB dataBase;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String authorizeUserByLoginAndPassword(String login, String password) {
        return null;
    }

    @Override
    public String changeNick(String login, String newNick) {
        return null;
    }

    @Override
    public User createNewUser(String login, String password, String nick) {
        return null;
    }

    @Override
    public void deleteUser(String login, String pass) {

    }

    @Override
    public void changePassword(String login, String oldPass, String newPass) {

    }

    @Override
    public void resetPassword(String login, String newPass, String secret) {

    }
}
