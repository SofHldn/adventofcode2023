package aoc.day1;

import java.util.List;

import aoc.util.FileUtil;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class Day1 {

    public int calculateCalibrationValue() {

        int result = 0;
        List<String> rows = FileUtil.readFile("day1/inputDay1.txt");
        for (String row : rows) {
            List<Character> numbers = row.chars().mapToObj(c -> (char) c).filter(Character::isDigit).toList();
            result += Integer.parseInt("" + numbers.get(0) + numbers.get(numbers.size() - 1));
        }

        return result;

    }

    public int calculateCalibrationValuePart2() {
        int result = 0;
        List<String> rows = FileUtil.readFile("day1/inputDay1.txt");
        for (String row : rows) {
            row = getFixedRow(row);
            List<Character> numbers = row.chars().mapToObj(c -> (char) c).filter(Character::isDigit).toList();
            result += Integer.parseInt("" + numbers.get(0) + numbers.get(numbers.size() - 1));
        }
        return result;
    }

    private static String getFixedRow(String row) {
        return row
                .replace("one", "one1one")
                .replace("two", "two2two")
                .replace("three", "three3three")
                .replace("four", "four4four")
                .replace("five", "five5five")
                .replace("six", "six6six")
                .replace("seven", "seven7seven")
                .replace("eight", "eight8eight")
                .replace("nine", "nine9nine");
    }


}
