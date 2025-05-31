package dao;

import entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.MySessionFactory;

import java.util.List;

public class ProductDAO {

    public void save(Product product) {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(product);
        session.getTransaction().commit();
        session.close();
    }

    public List<Product> findAll() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        List productList = session.createQuery("from Product").list();
        return productList;
    }

    public Product findById(int id) {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Product product = session.getReference(Product.class, id);
        return product;
    }
}
