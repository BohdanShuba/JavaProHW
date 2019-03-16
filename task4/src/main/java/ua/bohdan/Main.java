package ua.bohdan;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSession();
          //  session.beginTransaction();
            try {

                Menu dish = new Menu("Ravioli8", 2.5, 100, true);
                session.save(dish); // списали грощі з клієнта
                Menu dish2 = new Menu("Ravioli2", 2.5, 100, true); // зарахували на карту
                session.save(dish2);
                session.getTransaction().commit();
            } catch (Exception e) {
                session.getTransaction().rollback();
            }

            session.close();
        } finally {
            HibernateUtil.destroy();
        }
    }

}
