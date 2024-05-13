package ua.skillup;

import java.time.LocalDate;
import java.util.Scanner;

public enum ZodiacSign {
    ARIES(21, 3, 20, 4),
    TAURUS(21, 4, 21, 5),
    GEMINI(22, 5, 21, 6),
    CANCER(22, 6, 22, 7),
    LEO(23, 7, 23, 8),
    VIRGO(24, 8, 23, 9),
    LIBRA(24, 9, 23, 10),
    SCORPIO(24, 10, 22, 11),
    SAGITTARIUS(23, 11, 21, 12),
    CAPRICORN(22, 12, 20, 1),
    AQUARIUS(21, 1, 19, 2),
    PISCES(20, 2, 20, 3);

    private final int beginDay;
    private final int beginMonth;
    private final int endDay;
    private final int endMonth;

    ZodiacSign(int beginDay, int beginMonth, int endDay, int endMonth) {
        this.beginDay = beginDay;
        this.beginMonth = beginMonth;
        this.endDay = endDay;
        this.endMonth = endMonth;
    }

    public static ZodiacSign getZodiacSign(int day, int month) {
        for (ZodiacSign sign : ZodiacSign.values()) {
            if ((month == sign.beginMonth && day >= sign.beginDay)
                    || (month == sign.endMonth && day <= sign.endDay)) {
                return sign;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-01'");

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
