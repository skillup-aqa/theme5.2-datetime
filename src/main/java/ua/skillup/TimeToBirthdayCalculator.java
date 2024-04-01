package ua.skillup;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TimeToBirthdayCalculator {
    public static int secondsToBirthday(LocalDate dateOfBirth, LocalDateTime now) {
        return -1;
    }

    public static int minutesToBirthday(LocalDate dateOfBirth, LocalDateTime now) {
        return -1;
    }

    public static int hoursToBirthday(LocalDate dateOfBirth, LocalDateTime now) {
        return -1;
    }

    public static int daysToBirthday(LocalDate dateOfBirth, LocalDateTime now) {
        return -1;
    }

    public static int monthsToBirthday(LocalDate dateOfBirth, LocalDateTime now) {
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-01'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirthString = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Until your next birthday:");
        System.out.println(secondsToBirthday(dateOfBirth, now) + " seconds");
        System.out.println(minutesToBirthday(dateOfBirth, now) + " minutes");
        System.out.println(hoursToBirthday(dateOfBirth, now) + " hours");
        System.out.println(daysToBirthday(dateOfBirth, now) + " days");
        System.out.println(monthsToBirthday(dateOfBirth, now) + " months");
    }
}
