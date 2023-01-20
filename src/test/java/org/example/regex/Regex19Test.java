package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex19Test {

    private static final String TEST_FILE = "regex19.txt";

    @Test
    public void firstTest() {
        final String regexPattern = "^[a-z]{4,6}$";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);
        List<String> matchingList = List.of("lion", "tiger", "mouse", "cuckoo", "deer");

        assertEquals(5, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
    }

}
