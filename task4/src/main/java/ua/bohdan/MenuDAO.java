package ua.bohdan;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MenuDAO {
    private Session session;

    public MenuDAO(Session session) {
        this.session = session;
    }


    public Menu getDish(String nameDish) {
        Menu dish = null;
        try {
            Query query = session.createQuery("SELECT s FROM MenuInRestaurant s");
            query.setParameter(nameDish, dish);
            dish = (Menu) query.uniqueResult();
            System.out.println(dish);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return dish;
    }

    public void addDish(Menu dish) {
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.save(dish);
            t.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            t.rollback();
        }
    }


//    public ua.bohdan.Menu findByDish(String dish) {
//        return ua.bohdan.HibernateSessionFactoryUtil.getSessionFactory().openSession().get(ua.bohdan.Menu.class, dish);
//    }
//
//    public void add(ua.bohdan.Menu menu) {
//        Session session = ua.bohdan.HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//            session.save(menu);
//            transaction.commit();
//            session.close();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            transaction.rollback();
//        }
//    }
//
////    public List<ua.bohdan.Menu> findAll() {
////        List<ua.bohdan.Menu> menu = (List<ua.bohdan.Menu>)ua.bohdan.HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From menuinrestaurant").list();
////        return menu;
////    }

}
