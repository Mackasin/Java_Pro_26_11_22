package com.hillel.dzhurynskyi.homework.hm23.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FishRestaurantTest {

    @Mock
    FishRestaurant fr;

    @Test
    void getCorrectFishMenusTest() {
        when(fr.getMenus()).thenReturn(List.of("Losos", "Forel"));
        assertEquals(List.of("Losos", "Forel"), fr.getMenus());
    }

    @Test
    void getActualValuesInFishMenusTest() {
        List<String> expectedValue = List.of("Kil'ka");
        FishRestaurant fr = new FishRestaurant();
        FishRestaurant frSpy = Mockito.spy(fr);
        assertEquals(expectedValue, frSpy.getMenus());
    }
}