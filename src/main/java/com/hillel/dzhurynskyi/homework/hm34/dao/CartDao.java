package com.hillel.dzhurynskyi.homework.hm34.dao;

import com.hillel.dzhurynskyi.homework.hm34.data.Cart;

public interface CartDao {
    void insert(Cart cart);

    void insert(int id, Cart cart);

    void delete(int id);

    Cart find(int id);
}
