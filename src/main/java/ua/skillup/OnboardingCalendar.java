package ua.skillup;

import java.time.LocalDate;
import java.time.Month;

public class OnboardingCalendar {

    public int getSecondTuesdayOfMonth(int month, int year) {
        LocalDate currentMonth = LocalDate.of(year, month, 1);
        int firstDayOfMonth = currentMonth.getDayOfWeek().getValue();
        if (firstDayOfMonth == 2) {
            return currentMonth.plusDays(7).getDayOfMonth();
        } else if (firstDayOfMonth > 2) {
            return currentMonth.plusDays(16 - firstDayOfMonth).getDayOfMonth();
        } else {
            return currentMonth.plusDays(9 - firstDayOfMonth).getDayOfMonth();
        }
    }


    public void printAllSecondTuesdaysOfYear(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Onboarding date for " + Month.of(i) + " is "
                    + getSecondTuesdayOfMonth(i, year));
        }
    }

    public static void main(String[] args) {
        OnboardingCalendar calendar = new OnboardingCalendar();
        calendar.printAllSecondTuesdaysOfYear(LocalDate.now().getYear());
    }
}
