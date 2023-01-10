package com.hillel.dzhurynskyi.homework.hm11.coffee.order;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CoffeeOrderBoard {
    private final Queue<Order> orderQueue;
    private int counter = 1;

    public CoffeeOrderBoard() {
        orderQueue = new LinkedList<>();
    }

    public void add(String name) {
        Order order = new Order(counter, name);
        orderQueue.add(order);
        counter++;
    }

    public void deliver() {
        orderQueue.remove();
    }

    public void deliver(int number) {
        for (Order order : orderQueue) {
            if (Objects.equals(order.getOrdNumb(), number)) {
                orderQueue.remove(order);
                return;
            }
        }
    }

    public void draw() {
        System.out.println("\t-----------------");
        System.out.println("\tNumber\t|\tName");

        for (Order order : orderQueue) {

            String stringBuilder = "\t\t" + order.getOrdNumb() +
                    "\t|\t" +
                    order.getNameOfCustomer();

            System.out.println(stringBuilder);
        }
    }
}
