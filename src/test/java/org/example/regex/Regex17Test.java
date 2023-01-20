package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Regex17Test {

    private static final String TEST_FILE = "regex17.txt";

    @Test
    public void firstTest() {
        final String regexPattern = "^foo$";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);

        assertEquals(1, lineList.size());
        assertEquals("foo", lineList.get(0));
    }

}
