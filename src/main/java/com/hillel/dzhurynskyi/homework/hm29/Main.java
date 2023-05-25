package com.hillel.dzhurynskyi.homework.hm29;

import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        OrderDao daoManager = new OrderDaoImpl();

        Order order = new Order(99999, Date.valueOf("2005-04-03"), Date.valueOf("2005-04-03"), null, "IN PROGRESS", "gg", 9999);

        daoManager.addOrder(order);

        System.out.println(daoManager.findOrder(99999));

        daoManager.updateOrder(99999,"SHIPPED","ORDER DELIVERED");

        daoManager.deleteOrder(99999);

        System.out.println(daoManager.findOrder(10101));

    }
}
