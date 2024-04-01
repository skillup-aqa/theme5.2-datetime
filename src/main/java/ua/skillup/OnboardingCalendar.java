package ua.skillup;

import java.time.LocalDate;

public class OnboardingCalendar {
    public int getSecondTuesdayOfMonth(int month, int year) {
        // TODO: implement this method
        return -1;
    }

    public void printAllSecondTuesdaysOfYear(int year) {
        // TODO: implement this method
    }

    public static void main(String[] args) {
        OnboardingCalendar calendar = new OnboardingCalendar();
        calendar.printAllSecondTuesdaysOfYear(LocalDate.now().getYear());
    }
}
