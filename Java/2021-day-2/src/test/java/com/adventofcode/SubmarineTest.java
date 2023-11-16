package com.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class SubmarineTest {
    @Test
    void testExercise1() throws FileNotFoundException {
        var total = Submarine.moveSubmarine("src/test/resources/example.dat");

        assertEquals(150, total);
    }
}