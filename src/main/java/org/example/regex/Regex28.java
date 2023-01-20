
package org.example.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Regex28 {

    public static List<String> getNameFormatted(final List<Matcher> matcherList) {

        List<String> lineList = new ArrayList<>();

        for (Matcher matcher : matcherList) {
            lineList.add(matcher.replaceAll("xxx.xxx." + matcher.group(1)));
        }
        return lineList;
    }

}
