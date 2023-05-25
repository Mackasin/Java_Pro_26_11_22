package com.hillel.dzhurynskyi.homework.hm24.template.method;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class NetOrderTest {
    @Spy
    NetOrder netOrder = new NetOrder();

    @Test
    void processOrderWhenIsGift() {
        NetOrder netOrder1 = Mockito.spy(netOrder);
        boolean isGift = true;
        netOrder1.processOrder(isGift);

        verify(netOrder1, times(1)).selectGoods();
        verify(netOrder1, times(1)).payment();
        verify(netOrder1, times(1)).giftWrap();
        verify(netOrder1, times(1)).delivery();
    }

    @Test
    void processOrderWhenNotGift() {
        NetOrder netOrder1 = Mockito.spy(netOrder);
        boolean isGift = false;
        netOrder1.processOrder(isGift);
        verify(netOrder1, times(1)).selectGoods();
        verify(netOrder1, times(1)).payment();
        verify(netOrder1, never()).giftWrap();
        verify(netOrder1, times(1)).delivery();
    }

    @Test
    void isGiftTrue() {
        netOrder.setGift(true);
        assertTrue(netOrder.isGift());
    }

    @Test
    void isGiftFalse() {
        netOrder.setGift(false);
        assertFalse(netOrder.isGift());
    }
}