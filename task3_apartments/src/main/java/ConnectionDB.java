import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/apartments_db?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=utf-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public ConnectionDB() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
