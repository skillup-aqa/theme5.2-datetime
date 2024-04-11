package ua.skillup;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TimeToBirthdayCalculator {


    public static long secondsToBirthday(LocalDateTime now, LocalDate nextBirthday) {
        return Duration.between(now, nextBirthday.atStartOfDay()).toSeconds();
    }

    public static long minutesToBirthday(LocalDateTime now, LocalDate nextBirthday) {
        return Duration.between(now, nextBirthday.atStartOfDay()).toMinutes();
    }

    public static long hoursToBirthday(LocalDateTime now, LocalDate nextBirthday) {
        return Duration.between(now, nextBirthday.atStartOfDay()).toHours();
    }

    public static long daysToBirthday(LocalDateTime now, LocalDate nextBirthday) {

        return ChronoUnit.DAYS.between(now, nextBirthday.atStartOfDay());
    }

    public static long monthsToBirthday(LocalDateTime now, LocalDate nextBirthday) {
        return ChronoUnit.MONTHS.between(now, nextBirthday.atStartOfDay());
    }

    public static LocalDate getNextBirthday(LocalDate dateOfBirth) {
        LocalDate now = LocalDate.now();
        LocalDate nextBirthday = LocalDate.of(now.getYear(), dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        if (nextBirthday.isBefore(now)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        System.out.println("Your next birthday is on: " + nextBirthday);
        return nextBirthday;
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-25'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirthStr = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        if (dateOfBirth.getMonthValue() == now.getMonthValue() && dateOfBirth.getDayOfMonth() == now.getDayOfMonth()) {
            System.out.println("Happy Birthday!");
            return;
        }

        LocalDate nextBirthday = getNextBirthday(dateOfBirth);

        System.out.println("Until your next birthday:");
        System.out.println(secondsToBirthday(now, nextBirthday) + " seconds");
        System.out.println(minutesToBirthday(now, nextBirthday) + " minutes");
        System.out.println(hoursToBirthday(now, nextBirthday) + " hours");
        System.out.println(daysToBirthday(now, nextBirthday) + " days");
        System.out.println(monthsToBirthday(now, nextBirthday) + " months");
    }
}
