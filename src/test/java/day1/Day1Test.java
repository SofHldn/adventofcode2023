package day1;

import aoc.day1.Day1;
import org.junit.jupiter.api.Test;

public class Day1Test {
    @Test
    void calculateCalibrationValue(){
        Day1 day1 = new Day1();
        int result = day1.calculateCalibrationValue();
        System.out.println(result);
    }

    @Test
    void calculateCalibrationValuePart2(){
        Day1 day1 = new Day1();
        int result = day1.calculateCalibrationValuePart2();
        System.out.println(result);
    }
    
    
}
