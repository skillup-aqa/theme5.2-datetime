package ua.skillup;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.testng.Assert.assertEquals;

public class ConvertorToTimeZoneTest {
    @Test
    public void testConvertToTimezone() {
        ZonedDateTime dateTime1 = ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.of("Etc/GMT+0"));
        ZonedDateTime converted = ConvertorToTimeZone.convertToTimezone(dateTime1, "Etc/GMT+1");

        LocalDateTime expected = dateTime1.minusHours(1).toLocalDateTime();
        LocalDateTime actual = converted.toLocalDateTime();

        assertEquals(actual, expected);
    }
}
