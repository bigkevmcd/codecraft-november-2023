package com.adventofcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class ExpensesTest {
    @Test
    void testExercise1() throws FileNotFoundException {
        var total = Expenses.findExpensesForTotal("src/test/resources/exercise1.dat", 2020);

        assertEquals(514579, total);
    }
}