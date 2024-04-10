package ua.skillup;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCalculator {
    public static String calculateDayOfWeek(int year, int month, int day) {
        LocalDate setDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = setDate.getDayOfWeek();

        return dayOfWeek.toString();
    }

    public static void printFirstDayOfWeekAndLastDayOfWeek() {
        //should be renamed to printFirstDayOfMonthAndLastDayOfMonth
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDay = currentDate.withDayOfMonth(1);
        LocalDate lastDay = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
        System.out.println("First day of month is " + firstDay.getDayOfWeek().toString());
        System.out.println("Last day of month is " + lastDay.getDayOfWeek().toString());
    }

    public static void main(String[] args) {

        System.out.println(calculateDayOfWeek(2024, 4, 10));
        printFirstDayOfWeekAndLastDayOfWeek();
    }
}
