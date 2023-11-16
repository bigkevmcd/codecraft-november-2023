package com.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Submarine {
    record Instruction(String operation, int delta) {
    }

    public static long moveSubmarine(String filename) throws FileNotFoundException {
        var instructions = parseInstructions(filename);

        return 0L;
    }

    private static List<Instruction> parseInstructions(String filename) throws FileNotFoundException {
        var result = new ArrayList<Instruction>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                var components = StringUtils.split(scanner.nextLine());

                result.add(new Instruction(components[0], Integer.valueOf(components[1])));
            }
        }

        return result;
    }
}
