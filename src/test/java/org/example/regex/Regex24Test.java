package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex24Test {

    private static final String TEST_FILE = "regex24.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "(log|ply)wood";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);
        List<String> matchingList = List.of("logwood", "plywood");

        assertEquals(2, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
    }

}
