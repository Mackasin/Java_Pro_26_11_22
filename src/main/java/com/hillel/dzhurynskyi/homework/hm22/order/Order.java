package com.hillel.dzhurynskyi.homework.hm22.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Order {
    private static final Logger log = LoggerFactory.getLogger(Order.class.getName());
    private int orderNumber;
    private String nameOfCustomer;


    public Order(int orderNumber, String nameOfCustomer) {
        this.orderNumber = orderNumber;
        this.nameOfCustomer = nameOfCustomer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Objects.equals(nameOfCustomer, order.nameOfCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, nameOfCustomer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                '}';
    }
}
