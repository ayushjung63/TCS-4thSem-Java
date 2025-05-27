import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();

        Product product = new Product("Laptop","256GB SSD Laptop",1000);

        session.beginTransaction();
        session.persist(product);
        session.getTransaction().commit();

    }
}
