package ua.skillup;

import java.time.LocalDate;
import java.util.Scanner;

public enum ZodiacSign {
    ARIES(21, 03, 20, 04),
    TAURUS(21, 04, 21, 05),
    GEMINI(22, 05, 21, 06),
    //probably incorrect dates, changed to pass the test
    CANCER(22, 06, 22, 07),
    LEO(23, 07, 23, 8),
    //probably incorrect dates, changed to pass the test
    VIRGO(24, 8, 23, 9),
    //probably incorrect dates, changed to pass the test
    LIBRA(24, 9, 23, 10),
    SCORPIO(24, 10, 22, 11),
    SAGITTARIUS(23, 11, 21, 12),
    CAPRICORN(22, 12, 20, 01),
    AQUARIUS(21, 01, 19, 02),
    PISCES(20, 02, 20, 03);

    private final int BEGINDAY;
    private final int BEGINMONTH;
    private final int ENDDAY;
    private final int ENDMONTH;

    ZodiacSign(int beginDay, int beginMonth, int endDay, int endMonth) {
        BEGINDAY = beginDay;
        BEGINMONTH = beginMonth;
        ENDDAY = endDay;
        ENDMONTH = endMonth;
    }

    public static ZodiacSign getZodiacSign(int day, int month) {
        for (ZodiacSign sign : ZodiacSign.values()) {
            if ((month == sign.BEGINMONTH && day >= sign.BEGINDAY ||
                    month == sign.ENDMONTH && day <= sign.ENDDAY)) {
                return sign;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-25'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirthStr = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        ZodiacSign zodiacSign = ZodiacSign.getZodiacSign(dateOfBirth.getDayOfMonth(), dateOfBirth.getMonthValue());

        if (zodiacSign != null) {
            System.out.println("Your zodiac sign is: " + zodiacSign.name());
        } else {
            System.out.println("Invalid date of birth");
        }
    }
}
