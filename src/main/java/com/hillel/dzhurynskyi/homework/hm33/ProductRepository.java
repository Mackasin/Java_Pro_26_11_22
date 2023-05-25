package com.hillel.dzhurynskyi.homework.hm33;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private  List<Product> productRepository;

    public ProductRepository() {
        this.productRepository = new ArrayList<>();
    }
    @PostConstruct
    private void init(){
        productRepository.add(new Product(1,"Bread",15));
        productRepository.add(new Product(2,"Tea",45));
        productRepository.add(new Product(3,"Cheese",100.50));
        productRepository.add(new Product(4,"Sausage",150));
        productRepository.add(new Product(5,"Milk",55));
        productRepository.add(new Product(6,"Eggs",60));
        productRepository.add(new Product(7,"Water",15));
        productRepository.add(new Product(8,"Cola",45));
    }

    public void addProduct(Product product) {
        productRepository.add(product);
    }


    public void deleteProduct(int id) {
        productRepository.removeIf(product -> product.getId() == id);
    }


    public List<Product> getAllProducts() {
        return productRepository;
    }


    public Product getProductById(int id) {
        for (Product product : productRepository) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productRepository=" + productRepository +
                '}';
    }
}
