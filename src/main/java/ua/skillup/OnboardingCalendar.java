package ua.skillup;

import java.time.LocalDate;
import java.time.Month;

public class OnboardingCalendar {
    public int getSecondTuesdayOfMonth(int month, int year) {
        LocalDate thisMonth = LocalDate.of(year, month, 1);
        int thisDay = thisMonth.getDayOfWeek().getValue();
        if (thisDay > 2) {
            return thisMonth.plusDays(16 - thisDay).getDayOfMonth();
        } else {
            return thisMonth.plusDays(9 - thisDay).getDayOfMonth();
        }
    }

    public void printAllSecondTuesdaysOfYear(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Second Tuesday of " + Month.of(i) + " is " + getSecondTuesdayOfMonth(i, year));
        }
    }

    public static void main(String[] args) {
        OnboardingCalendar calendar = new OnboardingCalendar();
        calendar.printAllSecondTuesdaysOfYear(LocalDate.now().getYear());
    }
}
