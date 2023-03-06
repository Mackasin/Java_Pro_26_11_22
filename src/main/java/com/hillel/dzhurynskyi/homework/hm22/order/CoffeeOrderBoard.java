package com.hillel.dzhurynskyi.homework.hm22.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CoffeeOrderBoard {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderBoard.class.getName());
    private final Queue<Order> orderQueue = new LinkedList<>();
    private int counter = 1;


    public void add(String name) {
        log.info("Added order {} for {}.", counter, name);
        Order order = new Order(counter, name);
        orderQueue.add(order);
        counter++;
    }

    public void deliver() {
        if (orderQueue.isEmpty()) {
            log.info("No orders to deliver.");
            return;
        }
        log.info("Delivered {}.", orderQueue.element());
        orderQueue.remove();
    }

    public void deliver(int number) {
        for (Order order : orderQueue) {
            if (Objects.equals(order.getOrderNumber(), number)) {
                log.info("Delivered {}.", orderQueue.element());
                orderQueue.remove(order);
                return;
            }
        }
        log.info("Order {} not found.", number);
    }

    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n============= \n");
        sb.append("Num | Name \n");

        for (Order order : orderQueue) {
            sb.append(String.format("%d \t| %s \n", order.getOrderNumber(), order.getNameOfCustomer()));
        }

        log.info(sb.toString());

    }
}
