package ua.skillup;

import org.testng.annotations.Test;

public class DayOfWeekCalculatorTest {
    @Test
    public void testCalculateDayOfWeek() {
        String dayOfWeek = DayOfWeekCalculator.calculateDayOfWeek(2020, 1, 1);
        assert dayOfWeek.equals("WEDNESDAY");
    }
}
