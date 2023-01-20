package org.example.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Regex27 {

    public static List<String> getNameFormatted(final List<Matcher> matcherList) {

        List<String> lineList = new ArrayList<>();

        for (Matcher matcher : matcherList) {
            lineList.add(matcher.replaceAll(matcher.group(2) + " mins past " + matcher.group(1)));
        }
        return lineList;
    }

}
