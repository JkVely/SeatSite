package seatsite.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseConnection {
    private static Connection connection;

    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find db.properties");
            } else {
                prop.load(input);
                String url = prop.getProperty("db.url");
                String user = prop.getProperty("db.username");
                String password = prop.getProperty("db.password");
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}