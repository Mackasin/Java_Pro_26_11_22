package com.hillel.dzhurynskyi.homework.hm23.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class HotelCuisineTest {

    @Spy
    HotelCuisine hc = new HotelCuisine();

    @Test
    void getCorrectHotelAllMenusTest() {
        hc.getMenus();
        verify(hc, atLeastOnce()).getMenus();
    }

    @Test
    void getCorrectHotelAllVineCardTest() {
        HotelCuisine hc = new HotelCuisine();
        Map<String, Integer> expectedValue = Map.of("Proseco", 1965);
        assertEquals(expectedValue, hc.getVineCard());
    }
}