package com.pluralsight.NorthwindTradersSpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class NorthwindApplication implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;
    @Override
    public void run(String... args) {
        Product newProduct = new Product(3, "Brand Nu Item", "Misc", 19.99);
        productDao.add(newProduct);

        System.out.println("All Products:");
        productDao.getAll().forEach(System.out::println);
    }
}