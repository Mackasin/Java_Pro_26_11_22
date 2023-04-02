package com.hillel.dzhurynskyi.homework.hm29;

import java.sql.SQLException;

public interface OrderDao {
    void addOrder(Order order) throws SQLException;

    void updateOrder(int id, String newOrderStatus, String newOrderComment) throws SQLException;

    void deleteOrder(int id) throws SQLException;

    Order findOrder(int id) throws SQLException;
}
