import java.util.List;

public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();

    public MenuService() {
    }

    public Menu findDish(String dish) {
        return menuDAO.findByDish(dish);
    }
    public void addDish(Menu menu){
        menuDAO.add(menu);
    }
//    public List<Menu> findAllUsers() {
//        return MenuDAO.findAll();
//    }
}
