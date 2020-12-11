package helper;

import conn.AppConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    public Connection connection = null;

    public void testDriver() throws ClassNotFoundException {
        Class.forName(AppConfig.DRIVER.getValue());
    }

    public Connection getConnection() throws ClassNotFoundException{
        this.testDriver();
        try {
            connection = DriverManager.getConnection(AppConfig.URL_DATABASE.getValue(), AppConfig.USERNAME.getValue(), AppConfig.PASSWORD.getValue());
            System.out.println("Connection");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("khong tim thay");
        }

        return connection;
    }
}
