package com.hillel.dzhurynskyi.homework.hm23.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;


@ExtendWith(MockitoExtension.class)
class VegetarianRestaurantTest {

    @Mock
    VegetarianRestaurant vr;

    @Test
    void getCorrectVeganMenusTest() {
        doReturn(List.of("Salad", "Ukrop")).when(vr).getMenus();
        assertEquals(List.of("Salad", "Ukrop"), vr.getMenus());
    }

    @Test
    void getActualValuesInVeganMenusTest() {
        List<String> expectedValue = List.of("Ukrop");
        VegetarianRestaurant vr = new VegetarianRestaurant();
        assertEquals(expectedValue, vr.getMenus());
    }

}