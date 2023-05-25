package com.hillel.dzhurynskyi.homework.hm24.chain.of.responsibility;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ChainTest {

    @Test
    public void testProcessPositiveRequest() {
        AbstractProcessor mockProcessor = mock(AbstractProcessor.class);
        Chain chain = new Chain();
        chain.process(1);
        verify(mockProcessor, times(0)).process(anyInt());
    }

    @Test
    public void testProcessNegativeRequest() {
        AbstractProcessor mockProcessor = mock(AbstractProcessor.class);
        Chain chain = new Chain();
        chain.process(-1);
        verify(mockProcessor, times(0)).process(anyInt());
    }

    @Test
    public void testProcessZeroRequest() {
        AbstractProcessor mockProcessor = mock(AbstractProcessor.class);
        Chain chain = new Chain();
        chain.process(0);
        verify(mockProcessor, times(0)).process(anyInt());
    }

    @Test
    public void testProcessMixedRequest() {
        AbstractProcessor mockProcessor1 = mock(AbstractProcessor.class);
        AbstractProcessor mockProcessor2 = mock(AbstractProcessor.class);
        AbstractProcessor mockProcessor3 = mock(AbstractProcessor.class);

        AbstractProcessor zeroProcessor = new ZeroProcessor(mockProcessor1);
        AbstractProcessor positiveProcessor = new PositiveProcessor(zeroProcessor);
        AbstractProcessor negativeProcessor = new NegativeProcessor(positiveProcessor);

        Chain chain = new Chain();
        chain.process(1);
        verify(mockProcessor1, times(0)).process(anyInt());
        verify(mockProcessor2, times(0)).process(anyInt());
        verify(mockProcessor3, times(0)).process(anyInt());

        chain.process(-1);
        verify(mockProcessor1, times(0)).process(anyInt());
        verify(mockProcessor2, times(0)).process(anyInt());
        verify(mockProcessor3, times(0)).process(anyInt());

        chain.process(0);
        verify(mockProcessor1, times(0)).process(anyInt());
        verify(mockProcessor2, times(0)).process(anyInt());
        verify(mockProcessor3, times(0)).process(anyInt());
    }
}