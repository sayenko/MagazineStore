package ua.com.magazine_store.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static String USER_NAME = "root";
    private static String USER_PASSWORD = "root";
    private static String URL = "jdbc:mysql://localhost/my_store?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";


    public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, SQLException {
        Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
        return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
    }
}