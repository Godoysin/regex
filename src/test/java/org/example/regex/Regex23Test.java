package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex23Test {

    private static final String TEST_FILE = "regex23.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "https?://website";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);
        List<String> matchingList = List.of("https://website", "http://website");

        assertEquals(2, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
    }

}
