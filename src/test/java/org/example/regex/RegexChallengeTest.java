package org.example.regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexChallengeTest {

    private static final String TEST_FILE = "regexChallenge.txt";
    @Test
    public void firstTest() {
        final String regexPattern = "^[a-z-\\.\\-_0-9]+@[a-z]+\\.[a-z]+";

        List<String> lineList = Regex.getResult(regexPattern, TEST_FILE);

        List<String> matchingList = List.of("bob.123@gmail.com", "alice-personal@yahoo.in", "admin@cloud.guru", "tom_business@amazon.ca");

        assertEquals(4, lineList.size());
        assertEquals(matchingList.get(0), lineList.get(0));
        assertEquals(matchingList.get(1), lineList.get(1));
        assertEquals(matchingList.get(2), lineList.get(2));
        assertEquals(matchingList.get(3), lineList.get(3));
    }

}
