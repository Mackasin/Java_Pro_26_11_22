package com.hillel.dzhurynskyi.homework.hm23.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlasticToyDuckTest {


    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void squeakCorrectSoundTest() {
        ToyDuck plasticDuck = new PlasticToyDuck();
        plasticDuck.squeak();
        assertEquals("Squeak", outputStreamCaptor.toString()
                .trim());
    }
}