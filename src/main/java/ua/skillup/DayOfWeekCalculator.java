package ua.skillup;

import java.time.LocalDate;

public class DayOfWeekCalculator {
    public static String calculateDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void printFirstDayOfMonthAndLastDayOfMonth() {
        LocalDate date = LocalDate.now();
        LocalDate firstDayOfMonth = date.withDayOfMonth(1);
        LocalDate lastDayOfMonth = date.withDayOfMonth(date.lengthOfMonth());

        System.out.println("First day of the month: " + firstDayOfMonth.getDayOfWeek().name());
        System.out.println("Last day of the month: " + lastDayOfMonth.getDayOfWeek().name());
    }

    public static void main(String[] args) {
        printFirstDayOfMonthAndLastDayOfMonth();
    }
}
