package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex27Test {

    private static final String TEST_FILE = "regex27.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "([0-9]+):([0-9]+)";

        List<Matcher> matcherList = Regex.getMacher(regexPattern, TEST_FILE);
        List<String> lineList = Regex27.getNameFormatted(matcherList);

        List<String> matchingList = List.of("32 mins past 7", "12 mins past 6", "23 mins past 12", "23 mins past 1", "33 mins past 11", "21 mins past 4");

        assertEquals(6, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
        assertEquals(matchingList.get(5), lineList.get(5));
    }

}
