package ua.bohdan;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


public class SelectedMenu {
    List<Menu> list = null;

    public void addDish(Menu... dishes) {
        Session session1 = HibernateUtil.getSession();
        try {
            session1.beginTransaction();
            for (Menu dish : dishes) {
                session1.save(dish);
            }
            session1.getTransaction().commit();
        } catch (Exception e) {
            session1.getTransaction().rollback();
        }
        session1.close();
    }

    public List<Menu> chooseRandomDishes(){
        System.out.println("Dishes at a discount:");
        String query = "FROM Menu ORDER BY rand() LIMIT 1";



        return getMenuList(query);
    }

    public List<Menu> getDish() {
        System.out.println("Menu:");
        String query = "From Menu Order by dish";
        return getMenuList(query);
    }

    public List<Menu> getDishDiscount() {
        System.out.println("Dishes at a discount:");
        String query = "From Menu Where discount = true";
        return getMenuList(query);
    }

    public List<Menu> getMenuList(String s) {
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery(s);
            list = (List<Menu>) query.list();
            /////
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();
        //printMenu(list);
        return list;
    }

    private void printMenu(List<Menu> list) {
        if (list != null && !list.isEmpty()) {
            for (Menu menu : list) {
                System.out.println(menu);
            }
        }
    }
}





