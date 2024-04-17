package ua.skillup;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCalculator {
    public static String calculateDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString();
    }

    public static void printFirstDayOfWeekAndLastDayOfWeek() {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.withDayOfMonth(1);
        LocalDate lastDay = today.withDayOfMonth(today.lengthOfMonth());
        System.out.println("First day of this month is: " + firstDay.getDayOfWeek().name());
        System.out.println("Last day of this month is: " + lastDay.getDayOfWeek().name());


    }

    public static void main(String[] args) {
        printFirstDayOfWeekAndLastDayOfWeek();
        System.out.println(calculateDayOfWeek(2024, 04, 16));
    }
}
