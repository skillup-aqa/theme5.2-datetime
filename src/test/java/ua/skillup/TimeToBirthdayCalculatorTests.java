package ua.skillup;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.testng.Assert.assertEquals;

public class TimeToBirthdayCalculatorTests {
    LocalDateTime now = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

    @Test
    public void testCalculateSecondsToBirthday() {
        LocalDate birthday = now.minusMinutes(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.secondsToBirthday(birthday, now), 60);
    }

    @Test
    public void testCalculateMinutesToBirthday() {
        LocalDate birthday = now.minusHours(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.minutesToBirthday(birthday, now), 60);
    }

    @Test
    public void testCalculateHoursToBirthday() {
        LocalDate birthday = now.minusDays(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.hoursToBirthday(birthday, now), 24);
    }

    @Test
    public void testCalculateDaysToBirthday() {
        LocalDate birthday = now.minusDays(10).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.daysToBirthday(birthday, now), 10);
    }

    @Test
    public void testCalculateMonthsToBirthday() {
        LocalDate birthday = now.minusMonths(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.monthsToBirthday(birthday, now), 1);
    }
}
