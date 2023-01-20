package org.example.regex;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Regex14Test {

    private static final String TEST_FILE = "regex14.txt";

    @Test
    public void firstTest() {
        final String regexPattern = "x[#\\\\\\^]y";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);
        List<String> matchingList = List.of("x#y", "x\\y", "x^y");

        assertEquals(3, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
    }

}
