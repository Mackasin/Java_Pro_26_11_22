package com.hillel.dzhurynskyi.homework.hm11.coffee.order;

import java.util.Objects;

public class Order {
    private int ordNumb;
    private String nameOfCustomer;


    public Order(int ordNumb, String nameOfCustomer) {
        this.ordNumb = ordNumb;
        this.nameOfCustomer = nameOfCustomer;
    }

    public int getOrdNumb() {
        return ordNumb;
    }

    public void setOrdNumb(int ordNumb) {
        this.ordNumb = ordNumb;
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
        return ordNumb == order.ordNumb && Objects.equals(nameOfCustomer, order.nameOfCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordNumb, nameOfCustomer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordNumb=" + ordNumb +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                '}';
    }
}
