package org.example.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static List<String> getResult(final String regexPattern, final String inputFileName) {

		List<String> lineList = new ArrayList<>();

		// Create a Pattern object
		Pattern r = Pattern.compile(regexPattern);

		// Read the input file line by line
		try (BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(Regex.class.getClassLoader().getResourceAsStream(inputFileName)))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {

				// Now create matcher object.
				Matcher m = r.matcher(line);

				// Apply the regex pattern to each line
				// If pattern matches, output the current line.
				if (m.find()) {
					lineList.add(line);
					System.out.println(line);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lineList;

	}

	public static List<Matcher> getMacher(final String regexPattern, final String inputFileName) {

		List<String> lineList = getResult(regexPattern, inputFileName);

		List<Matcher> matcherList = new ArrayList<>();

		// Create a Pattern object
		Pattern r = Pattern.compile(regexPattern);

		for (String line : lineList) {
			// Now create matcher object.
			Matcher m = r.matcher(line);

			if (m.find()) {
				matcherList.add(m);
//				pixList.add(m.replaceAll(m.group(1) + " pix by " + m.group(2) + " pix"));
			}
		}

		return matcherList;
	}

}
