package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex29Test {

    private static final String TEST_FILE = "regex29.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "([A-Z]{1}[a-z]{2})\\s([0-9]{1,2})[a-z]{2}\\s[0-9]{2}([0-9]{2})";

        List<Matcher> matcherList = Regex.getMacher(regexPattern, TEST_FILE);
        List<String> lineList = Regex29.getNameFormatted(matcherList);

        List<String> matchingList = List.of("5-Jan-87", "26-Dec-10", "2-Mar-23", "1-Oct-08", "3-Aug-09", "10-Jun-01");

        assertEquals(6, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
        assertEquals(matchingList.get(5), lineList.get(5));
    }

}
