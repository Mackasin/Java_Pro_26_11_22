package com.hillel.dzhurynskyi.homework.hm23.facade;

import java.util.List;

public class VegetarianRestaurant implements Restaurant {

    @Override
    public List<String> getMenus() {
        return List.of("Ukrop");
    }
}
