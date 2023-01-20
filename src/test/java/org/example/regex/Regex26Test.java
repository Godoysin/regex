package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex26Test {

    private static final String TEST_FILE = "regex26.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "([a-zA-Z]+)\\s([a-zA-Z]+)";

        List<Matcher> matcherList = Regex.getMacher(regexPattern, TEST_FILE);
        List<String> lineList = Regex26.getNameFormatted(matcherList);

        List<String> matchingList = List.of("Wallace, John", "King, Steve", "Cook, Martin", "Smith, Adam", "Peter, Irene", "Johnson, Alice");

        assertEquals(6, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
        assertEquals(matchingList.get(5), lineList.get(5));
    }

}
