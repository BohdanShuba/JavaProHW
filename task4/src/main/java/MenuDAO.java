import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;


public class MenuDAO {
    public Menu findByDish(String dish) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Menu.class, dish);
    }

    public void add(Menu menu) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(menu);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

//    public List<Menu> findAll() {
//        List<Menu> menu = (List<Menu>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From menuinrestaurant").list();
//        return menu;
//    }

}
