package com.hillel.dzhurynskyi.homework.hm30;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        initRepo();
    }

    public Order getById(int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public boolean insertOrder(Order order) {
        return orders.add(order);
    }


    public void initRepo() {
        orders = new ArrayList<>();
        Order order1 = new Order(66, LocalDateTime.now(), 0, null);
        List<Product> products = new ArrayList<>();
        List<Product> products1 = new ArrayList<>();
        Product product1 = new Product(111, "Milk", 39.50);
        Product product2 = new Product(101, "Bread", 30.75);

        products1.add(product1);
        products1.add(product2);

        order1.setProducts(products1);
        order1.setCost(products1.stream().mapToDouble(Product::getCost).sum());

        orders.add(order1);


        Order order2 = new Order(77, LocalDateTime.now().minusDays(3), 0, null);
        products.add(new Product(1, "Butter", 45));
        products.add(product2);
        products.add(new Product(9, "cola", 45.89));
        order2.setCost(products.stream().mapToDouble(Product::getCost).sum());
        order2.setProducts(products);
        orders.add(order2);
    }
}