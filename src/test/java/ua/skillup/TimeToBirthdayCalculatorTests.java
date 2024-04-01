package ua.skillup;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.testng.Assert.assertEquals;

public class TimeToBirthdayCalculatorTests {
    LocalDateTime now = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

    @Test
    public void testCalculateSecondsToBirthday() {
        LocalDate birthday = now.plusDays(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.secondsToBirthday(now, birthday), 60 * 60 * 24);
    }

    @Test
    public void testCalculateMinutesToBirthday() {
        LocalDate birthday = now.plusDays(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.minutesToBirthday(now, birthday), 60 * 24);
    }

    @Test
    public void testCalculateHoursToBirthday() {
        LocalDate birthday = now.plusDays(1).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.hoursToBirthday(now, birthday), 24);
    }

    @Test
    public void testCalculateDaysToBirthday() {
        LocalDate birthday = now.plusDays(10).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.daysToBirthday(now, birthday), 10);
    }

    @Test
    public void testCalculateMonthsToBirthday() {
        LocalDate birthday = now.plusMonths(10).toLocalDate();
        assertEquals(TimeToBirthdayCalculator.monthsToBirthday(now, birthday), 10);
    }

    @Test
    public void testGetNextBirthdayThisYear() {
        LocalDate birthday = LocalDate.now().minusYears(10).plusDays(1);
        LocalDate expected = LocalDate.now().plusDays(1);
        assertEquals(TimeToBirthdayCalculator.getNextBirthday(birthday), expected);
    }

    @Test
    public void testGetNextBirthdayNextYear() {
        LocalDate birthday = LocalDate.now().minusYears(10).minusDays(1);
        LocalDate expected = LocalDate.now().minusDays(1).plusYears(1);
        assertEquals(TimeToBirthdayCalculator.getNextBirthday(birthday), expected);
    }
}
