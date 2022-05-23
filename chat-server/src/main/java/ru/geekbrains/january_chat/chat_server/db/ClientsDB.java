package ru.geekbrains.january_chat.chat_server.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientsDB {

    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String CONNECT = "jdbc:sqlite:db/clients.db";
    private static final String GET_NAME = "select username from clients where login = ? and password = ?";
    private static final String CHANGE_NAME = "update clients set username = ? where login = ?" ;
    private static final String CREATE_DB = "create table if not exists clients(id integer primary key autoincrement," +
            "login text unique not null, password text not null,username text unique not null);";
    private static final String INSERT_DB = "insert into clients(login,password,username) " +
            "values ('log1','pass1','user1'),('log2','pass2','user2),('log3','pass3','user3');";
    private Connection connection;

    private void createDb () {
        try (Statement st = connection.createStatement()) {
            st.execute(CREATE_DB);
            st.execute(INSERT_DB);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void connectionDB () {
        try (Statement stCon = connection.createStatement()) {
            stCon.executeQuery(CONNECT);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
