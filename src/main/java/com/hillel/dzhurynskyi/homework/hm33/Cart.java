package com.hillel.dzhurynskyi.homework.hm33;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.DEFAULT)
public class Cart {

    private final List<Product> cart = new ArrayList<>();


    public void addProductById(int id, ProductRepository productRepository) {
        cart.add(productRepository.getProductById(id));
    }


    public void deleteProductById(int id, ProductRepository productRepository) {
        cart.remove(productRepository.getProductById(id));
    }


    public List<Product> getCart() {
        return cart;
    }

    public double totalPrice() {
        return cart.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }
}