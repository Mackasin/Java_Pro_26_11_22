package com.hillel.dzhurynskyi.homework.hm33;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext("com.hillel.dzhurynskyi.homework.hm33");
        ProductRepository productRepository = appContext.getBean(ProductRepository.class);
        List<Cart> carts = new ArrayList<>();

        processCarts(carts, productRepository, appContext);
        printCarts(carts);
    }

    static void processCarts(List<Cart> carts, ProductRepository productRepository, ConfigurableApplicationContext context) {
        int id;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("To exit put \"N\":");
            if (input.hasNext() && (input.next().equalsIgnoreCase("n"))) {
                    break;

            }
            Cart workingCart = context.getBean(Cart.class);

            do {

                System.out.println("Available products: " + productRepository.getAllProducts());
                System.out.print("Please, choose product from 1 to 8 to add the current card: ");
                if (input.hasNextInt()) {
                    id = input.nextInt();
                    if (id >= 1 && id <= 8) {
                        workingCart.addProductById(id, productRepository);
                    }
                }

                while (true) {
                    if (workingCart.getCart().isEmpty()) {
                        System.out.println("You cart is empty.");
                        break;
                    }
                    System.out.println("You cart consists:");
                    System.out.println(workingCart.getCart());
                    System.out.print("To remove some products, enter product id, to continue, enter 0 (zero): ");
                    if (input.hasNextInt()) {
                        id = input.nextInt();
                        if (id == 0) {
                            break;
                        }
                        workingCart.deleteProductById(id, productRepository);
                    }
                }

                System.out.println("To stop making Cart, press \"N\":");
            } while (!input.hasNext() || (!input.next().equalsIgnoreCase("n")));
            carts.add(workingCart);
        }
    }

    static void printCarts(List<Cart> carts) {
        if (!carts.isEmpty()) {
            System.out.println("Your total order: ");
            carts.forEach(System.out::println);
            System.out.println("Your total prices: ");
            carts.forEach(cart -> System.out.println(cart.totalPrice()));
        }
    }
}

