package ua.skillup;

import java.time.LocalDate;
import java.time.Month;

public class OnboardingCalendar {
    public int getSecondTuesdayOfMonth(int month, int year) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        if(dayOfWeek > 2) {
            return firstDayOfMonth.plusDays(16 - dayOfWeek).getDayOfMonth();
        } else {
            return firstDayOfMonth.plusDays(9 - dayOfWeek).getDayOfMonth();
        }
    }

    public void printAllSecondTuesdaysOfYear(int year) {
        for(int i = 1; i <= 12; i++) {
            System.out.println("Second Tuesday of " + Month.of(i).name() + " is " + getSecondTuesdayOfMonth(i, year));
        }
    }

    public static void main(String[] args) {
        OnboardingCalendar calendar = new OnboardingCalendar();
        calendar.printAllSecondTuesdaysOfYear(LocalDate.now().getYear());
    }
}
