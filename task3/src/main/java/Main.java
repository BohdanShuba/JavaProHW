import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        ConnectionDB connectionDB = new ConnectionDB();

        String query = "select * from clients";

        try {
            Statement statement = connectionDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                System.out.println(name + " " + surname);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        try {
//            Driver driver = new com.mysql.cj.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
