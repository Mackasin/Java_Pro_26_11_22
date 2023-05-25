package com.hillel.dzhurynskyi.homework.hm23.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class MeatRestaurantTest {

    @Mock
    MeatRestaurant mr;

    @Test
    void getCorrectMeatMenusTest() {
        doReturn(List.of("Kotleta", "Svinina")).when(mr).getMenus();
        assertEquals(List.of("Kotleta", "Svinina"), mr.getMenus());
    }

    @Test
    void getActualValuesInMeatMenusTest() {
        List<String> expectedValue = List.of("Meat");
        MeatRestaurant mr = new MeatRestaurant();
        assertEquals(expectedValue, mr.getMenus());
    }
}