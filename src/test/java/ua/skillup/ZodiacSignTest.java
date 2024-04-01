package ua.skillup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ZodiacSignTest {
    @DataProvider(name = "zodiacSignData")
    public Object[][] getZodiacSignData() {
        return new Object[][] {
                {21, 3, ZodiacSign.ARIES},
                {20, 4, ZodiacSign.ARIES},
                {21, 4, ZodiacSign.TAURUS},
                {21, 5, ZodiacSign.TAURUS},
                {22, 5, ZodiacSign.GEMINI},
                {21, 6, ZodiacSign.GEMINI},
                {22, 6, ZodiacSign.CANCER},
                {22, 7, ZodiacSign.CANCER},
                {23, 7, ZodiacSign.LEO},
                {23, 8, ZodiacSign.LEO},
                {24, 8, ZodiacSign.VIRGO},
                {23, 9, ZodiacSign.VIRGO},
                {24, 9, ZodiacSign.LIBRA},
                {23, 10, ZodiacSign.LIBRA},
                {24, 10, ZodiacSign.SCORPIO},
                {22, 11, ZodiacSign.SCORPIO},
                {23, 11, ZodiacSign.SAGITTARIUS},
                {21, 12, ZodiacSign.SAGITTARIUS},
                {22, 12, ZodiacSign.CAPRICORN},
                {20, 1, ZodiacSign.CAPRICORN},
                {21, 1, ZodiacSign.AQUARIUS},
                {19, 2, ZodiacSign.AQUARIUS},
                {20, 2, ZodiacSign.PISCES},
                {20, 3, ZodiacSign.PISCES}
        };
    }

    @Test(dataProvider = "zodiacSignData")
    public void testGetZodiacSign(int day, int month, ZodiacSign expectedSign) {
        assertEquals(ZodiacSign.getZodiacSign(day, month), expectedSign);
    }
}
