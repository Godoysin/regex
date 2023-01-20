package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex25Test {

    private static final String TEST_FILE = "regex25.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "([0-9]+)x([0-9]+)";

        List<Matcher> matcherList = Regex.getMacher(regexPattern, TEST_FILE);
        List<String> lineList = Regex25.getPix(matcherList);

        List<String> matchingList = List.of("1280 pix by 720 pix", "1920 pix by 1080 pix", "1600 pix by 900 pix", "1280 pix by 1024 pix", "800 pix by 600 pix", "1024 pix by 768 pix");

        assertEquals(6, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
        assertEquals(matchingList.get(4), lineList.get(4));
        assertEquals(matchingList.get(5), lineList.get(5));
    }

}
