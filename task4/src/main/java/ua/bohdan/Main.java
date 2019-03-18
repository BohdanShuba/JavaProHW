package ua.bohdan;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSession();
            session.beginTransaction();
            try {

                Menu dish = new Menu("Ravioli", 3.3, 250, false);
                session.save(dish);
                Menu dish2 = new Menu("Noodles", 1.1, 200, true);
                session.save(dish2);
                Menu dish3 = new Menu("Salad", 1.1, 150, false);
                session.save(dish3);
                Menu dish4 = new Menu("Soup", 2.5, 220, true);
                session.save(dish4);
                Menu dish5 = new Menu("Lasagna", 3.5, 250, false);
                session.save(dish5);
                Menu dish6 = new Menu("Ratatouille", 3.2, 150, false);
                session.save(dish6);
                Menu dish7 = new Menu("Ramen", 4.1, 450, true);
                session.save(dish7);
                Menu dish8 = new Menu("Cheesecake", 1.35, 100, true);
                session.save(dish8);
                Menu dish9 = new Menu("Roast beef", 5.25, 300, true);
                session.save(dish9);
                Menu dish10 = new Menu("Ice cream", 1.45, 120, false);
                session.save(dish10);
                session.getTransaction().commit();
            } catch (Exception e) {
                session.getTransaction().rollback();
            }

            session.close();
        } finally {
            HibernateUtil.destroy();
        }

        List<Menu> list = null;
        try {
            Session session = HibernateUtil.getSession();
            session.beginTransaction();
            try {
                Query query = session.createQuery("From menu");
                list = (List<Menu>) query.list();
            } catch (Throwable e) {
                session.getTransaction().rollback();
            }
            session.close();
        } finally {
            HibernateUtil.destroy();
        }
        if (list != null && !list.isEmpty()) {
            for (Menu menu : list) {
                System.out.println(menu);
            }
        }

    }

}
