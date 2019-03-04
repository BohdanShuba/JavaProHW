import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        MenuService menuService = new MenuService();
        Menu dish = new Menu("Ravioli", 2.5, 100, true);
        menuService.addDish(dish);

    }
}
