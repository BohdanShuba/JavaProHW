package ua.bohdan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            SelectedMenu menu = new SelectedMenu();

            Menu dish = new Menu("Ravioli", 3.3, 250, false);
            Menu dish2 = new Menu("Noodles", 1.1, 200, true);
            Menu dish3 = new Menu("Salad", 1.1, 150, false);
            Menu dish4 = new Menu("Soup", 2.5, 220, true);
            Menu dish5 = new Menu("Lasagna", 3.5, 250, false);
            Menu dish6 = new Menu("Ratatouille", 3.2, 150, false);
            Menu dish7 = new Menu("Ramen", 4.1, 450, true);
            Menu dish8 = new Menu("Cheesecake", 1.35, 100, true);
            Menu dish9 = new Menu("Roast beef", 5.25, 300, true);
            Menu dish10 = new Menu("Ice cream", 1.45, 120, false);

            menu.addDish(dish, dish2, dish3, dish4, dish5, dish6, dish7, dish8, dish9, dish10);

            printMenu(menu.getDish());

            printMenu(menu.getDishDiscount());

        } finally {
            HibernateUtil.destroy();
        }

    }

    static void printMenu(List<Menu> list) {
        if (list != null && !list.isEmpty()) {
            for (Menu menu : list) {
                System.out.println(menu);
            }
        }
    }

}

