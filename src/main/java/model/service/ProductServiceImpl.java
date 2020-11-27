package model.service;

import model.entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl  implements IProductService {

    private static Map<Integer, Product> products;

    static {
        //String id, String name, double price, String description, String provider
        products = new HashMap<>();
        products.put(1, new Product(1,"iphone5",5000,"qweqwe","Apple"));
        products.put(2, new Product(2,"iphone6",6000,"qweqwe","Apple"));
        products.put(3, new Product(3,"iphone7",7000,"qweqwe","Apple"));
        products.put(4, new Product(4,"iphone8",8000,"qweqwe","Apple"));
        products.put(5, new Product(5,"iphone9",8000,"qweqwe","Apple"));
        products.put(6, new Product(7,"iphone10",10000,"qweqwe","Apple"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
