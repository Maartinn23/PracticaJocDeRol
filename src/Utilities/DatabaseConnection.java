package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:hsqldb:file:/PracticaJocDeRol/DataBase";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("No existeix el driver" + e.getMessage());
            throw new SQLException("Error inesperat, torna a intentar-ho", e);
        } catch (SQLException e) {
            System.err.println("Error durant la connexió a la bbdd, torna a intentar-ho" + e.getMessage());
            throw e;
        }
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error al tancar la connexió" + e.getMessage());
            }
        }
    }
}
