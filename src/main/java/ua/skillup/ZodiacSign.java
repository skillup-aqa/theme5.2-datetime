package ua.skillup;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public enum ZodiacSign {
    ARIES("Aries", 21, 3, 20, 4),
    TAURUS("Taurus", 21, 4, 21, 5),
    GEMINI("Gemini", 22, 5, 21, 6),
    CANCER("Cancer", 22, 6, 22, 7),
    LEO("Leo", 23, 7, 23, 8),
    VIRGO("Virgo", 24, 8, 23, 9),
    LIBRA("Libra", 24, 9, 23, 10),
    SCORPIO("Scorpio", 24, 10, 22, 11),
    SAGITTARIUS("Sagittarius", 23, 11, 21, 12),
    CAPRICORN("Capricorn", 22, 12, 20, 1),
    AQUARIUS("Aquarius", 21, 1, 19, 2),
    PISCES("Pisces", 20, 2, 20, 3);

    private final String name;
    private final int startDay;
    private final int startMonth;
    private final int endDay;
    private final int endMonth;

    ZodiacSign(String name, int startDay, int startMonth, int endDay, int endMonth) {
        this.name = name;
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.endDay = endDay;
        this.endMonth = endMonth;
    }

    public static ZodiacSign getZodiacSign(int day, int month) {
        for (ZodiacSign sign : ZodiacSign.values()) {
            if ((month == sign.startMonth && day >= sign.startDay) || (month == sign.endMonth && day <= sign.endDay)) {
                return sign;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-01'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirthStr = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        ZodiacSign zodiacSign = ZodiacSign.getZodiacSign(dateOfBirth.getDayOfMonth(), dateOfBirth.getMonthValue());

        if(zodiacSign != null) {
            System.out.println("Your zodiac sign is: " + zodiacSign.getName());
        } else {
            System.out.println("Invalid date of birth");
        }
    }
}
