package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex30Test {

    private static final String TEST_FILE = "regex30.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "\\(([0-9]+)\\)(.*)";

        List<Matcher> matcherList = Regex.getMacher(regexPattern, TEST_FILE);
        List<String> lineList = Regex30.getPhoneNumberFormatted(matcherList);

        List<String> matchingList = List.of("914.582.3013", "873.334.2589", "521.589.3147", "625.235.3698", "895.568.2145", "745.256.3369");

        assertEquals(6, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
        assertEquals(matchingList.get(5), lineList.get(5));
    }

}
