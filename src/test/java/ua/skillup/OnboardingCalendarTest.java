package ua.skillup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OnboardingCalendarTest {
    @DataProvider(name = "secondTuesdaysOfMonthData")
    public Object[][] getSecondTuesdaysOfMonthData() {
        return new Object[][] {
                {2024, 1, 9},
                {2024, 10, 8},
                {2024, 2, 13},
        };
    }

    @Test(dataProvider = "secondTuesdaysOfMonthData")
    public void testGetSecondTuesdayOfMonth(int year, int month, int expectedDay) {
        OnboardingCalendar calendar = new OnboardingCalendar();
        assertEquals(calendar.getSecondTuesdayOfMonth(month, year), expectedDay);
    }
}
