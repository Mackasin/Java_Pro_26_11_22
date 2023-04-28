package com.hillel.dzhurynskyi.homework.hm34;

import com.hillel.dzhurynskyi.homework.hm34.config.AppConfig;
import com.hillel.dzhurynskyi.homework.hm34.dao.CartDao;
import com.hillel.dzhurynskyi.homework.hm34.dao.ProductDao;
import com.hillel.dzhurynskyi.homework.hm34.data.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CartDao cartDao = context.getBean(CartDao.class);
        ProductDao productDao = context.getBean(ProductDao.class);

        System.out.println("Available products:");
        for (Product product : productDao.getAllProducts()) {
            System.out.println(product);
        }

//        Cart cart = new Cart();
//        cart.addProduct(productDao.findProduct(5));
//        cart.addProduct(productDao.findProduct(6));
//        cart.addProduct(productDao.findProduct(3));
//        cart.addProduct(productDao.findProduct(4));
//
//        cartDao.insert(1,cart);

            System.out.println(cartDao.find(1));


    }
}
