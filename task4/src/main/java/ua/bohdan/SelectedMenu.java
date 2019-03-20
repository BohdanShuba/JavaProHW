package ua.bohdan;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;


public class SelectedMenu {

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


    public List<Menu> chooseRandomDishes() {
        List<Menu> order = new ArrayList<>();
        System.out.println("Set of dishes:");

        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            int weightDisshSum = 0;
            for (int i = 0; i < 5; i++) {

                Query query = session.createQuery("FROM Menu ORDER BY rand()").setMaxResults(1);
                Menu dish = (Menu) query.list().get(0);

                if (dish.getWeight() <= 1000) {
                    weightDisshSum += dish.getWeight();
                    if (weightDisshSum > 1000) {
                        break;
                    } else order.add(dish);
                }
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();
        return order;
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
        List<Menu> list = null;
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery(s);
            list = (List<Menu>) query.list();
            //session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();
        return list;
    }

/*         ---the first version of the random selection method of dishes---

        public List<Menu> chooseRandomDishes() {
        List<Menu> list = null;
        List<Menu> order = new ArrayList<>();
        System.out.println("Set of dishes:");
        String query = "FROM Menu ORDER BY rand()";
        list = getMenuList(query);
        int weightDisshSum = 0;
        for (int i = 0; weightDisshSum < 1000; i++) {
            if (list.get(i).getWeight() <= 1000) {
                weightDisshSum += list.get(i).getWeight();
                order.add(list.get(i));
            }
            if (weightDisshSum > 1000) {
                order.remove(order.size() - 1);
                break;
            }
        }
        return order;
    }
    */

}





