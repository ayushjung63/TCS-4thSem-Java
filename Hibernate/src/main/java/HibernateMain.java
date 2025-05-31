import dao.ProductDAO;
import entity.Product;

import java.util.List;

public class HibernateMain {
    public static void main(String[] args) {

        ProductDAO productDAO=new ProductDAO();
        Product product = new Product("IPhone 16 Pro Max","6 ota camera",200);
//        productDAO.save(product);

        List<Product> all = productDAO.findAll();
        /*
          Name: Laptop Price: 1000
        * Name: Iphone Price: 200
        * */
        System.out.println(all);

        Product p = productDAO.findById(1);
        System.out.println("Product with id 1 is "+p.getName());

    }
}
