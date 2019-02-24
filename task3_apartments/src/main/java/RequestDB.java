import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RequestDB {


    public String initialQuery = "SELECT Dst, St, Bldg, Ap, Price, Area\n" +
            "FROM district\n" +
            "INNER JOIN street ON district.id = street.id_district\n" +
            "INNER JOIN building ON street.id = building.id_street\n" +
            "INNER JOIN apartment ON building.id = apartment.id_building";

    String queryParam = initialQuery;

    public void addParameter(String table, String value) {
        queryParam = initialQuery + "\nWHERE " + table + "='" + value + "'";
    }

    public void addParameter(String st, String str, String bldg, int bl) {
        queryParam = initialQuery + "\nWHERE " + st + "='" + str + "' AND " + bldg + "=" + bl;
    }

    public void addParameter(String price, double min, double max) {
        queryParam = initialQuery + "\nWHERE " + price + " BETWEEN " + min + " AND " + max;
    }

    public void showResult() {
        ConnectionDB connectionDB = new ConnectionDB();
        try {
            Statement statement = connectionDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(queryParam);

            if (resultSet.next() == true) {
                while (resultSet.next()) {
                    Apartments apartments = new Apartments();
                    apartments.setDistrict(resultSet.getString("Dst"));
                    apartments.setStreet(resultSet.getString("St"));
                    apartments.setBuilding(resultSet.getInt("Bldg"));
                    apartments.setNumber(resultSet.getInt("Ap"));
                    apartments.setPrice(resultSet.getDouble("Price"));
                    apartments.setArea(resultSet.getDouble("Area"));
                    System.out.println(apartments);
                }
            }else System.out.println("Data entered incorrectly");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

