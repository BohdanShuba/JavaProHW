import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/order_db?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute("insert into orders (id_clients, id_products) VALUES (5, 7);");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
