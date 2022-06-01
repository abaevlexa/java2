package ru.geekbrains.january_chat.chat_client;

import java.io.File;

public class LocalHistory {

    private static final int SIZE_HISTORY = 100;
    private static final String Path = "history/";
    private String login;
    private File history;

    public void HistoryProg(String login) {
        this.login = login;
        this.history = new File(Path + "history_[" + login + "].txt");
        if (!history.exists()) {
            File Path1 = new File(Path);
            Path1.mkdirs();
        }
    }

}
