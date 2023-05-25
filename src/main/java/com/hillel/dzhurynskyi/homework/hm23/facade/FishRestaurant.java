package com.hillel.dzhurynskyi.homework.hm23.facade;

import java.util.List;

public class FishRestaurant implements Restaurant {

    @Override
    public List<String> getMenus() {
        return List.of("Kil'ka");
    }
}