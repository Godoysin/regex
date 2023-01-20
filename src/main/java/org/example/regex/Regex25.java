package org.example.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Regex25 {

    public static List<String> getPix(final List<Matcher> matcherList) {

        List<String> lineList = new ArrayList<>();

        for (Matcher matcher : matcherList) {
            lineList.add(matcher.replaceAll(matcher.group(1) + " pix by " + matcher.group(2) + " pix"));
        }
        return lineList;
    }

}
