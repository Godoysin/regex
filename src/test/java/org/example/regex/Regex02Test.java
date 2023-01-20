package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex02Test {

    private static final String TEST_FILE = "regex02.txt";

    @Test
    public void firstTest() {
        final String regexPattern = "foo.bar";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);
        List<String> matchingList = List.of("fooabar", "fooxbar", "foocbar");

        assertEquals(3, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
    }

}
