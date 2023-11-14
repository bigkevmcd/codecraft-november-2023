package com.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Expenses {
    public static long findExpensesForTotal(String filename, long wantTotal) throws FileNotFoundException {
        var expenses = scanExpenses(filename);

        return 0L;
    }

    private static Long[] scanExpenses(String filename) throws FileNotFoundException {
        var result = new ArrayList<Long>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                result.add(Long.valueOf(scanner.nextLine()));
            }
        }

        return result.toArray(new Long[result.size()]);
    }
}
