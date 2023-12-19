package com.pluralsight.NorthwindTradersSpringBoot;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products;
    public SimpleProductDao() {
        products = new ArrayList<>();
        products.add(new Product(1, "Cat video compilations", "Necessities", 19.99));
        products.add(new Product(2, "Will to Live", "Luxuries", 2999.99));
    }
    @Override
    public void add(Product product) {
        products.add(product);
    }
    @Override
    public List<Product> getAll() {
        return products;
    }
}