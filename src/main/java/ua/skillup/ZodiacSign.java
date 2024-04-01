package ua.skillup;

import java.time.LocalDate;
import java.util.Scanner;

public enum ZodiacSign {
    ARIES,
    TAURUS,
    GEMINI,
    CANCER,
    LEO,
    VIRGO,
    LIBRA,
    SCORPIO,
    SAGITTARIUS,
    CAPRICORN,
    AQUARIUS,
    PISCES;

    public static ZodiacSign getZodiacSign(int day, int month) {
        // TODO: implement this method
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-01'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirthStr = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        ZodiacSign zodiacSign = ZodiacSign.getZodiacSign(dateOfBirth.getDayOfMonth(), dateOfBirth.getMonthValue());

        if(zodiacSign != null) {
            System.out.println("Your zodiac sign is: " + zodiacSign.name());
        } else {
            System.out.println("Invalid date of birth");
        }
    }
}
