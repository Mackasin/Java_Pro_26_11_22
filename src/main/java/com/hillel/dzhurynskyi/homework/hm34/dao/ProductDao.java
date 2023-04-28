package com.hillel.dzhurynskyi.homework.hm34.dao;

import com.hillel.dzhurynskyi.homework.hm34.data.Product;

import java.util.List;

public interface ProductDao {
    boolean deleteProduct(int id);
    boolean insertProduct(Product product);
    Product findProduct(int id);
    List<Product> getAllProducts();
}
