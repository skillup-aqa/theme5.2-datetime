package ua.skillup;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static int calculateAge(LocalDate dateOfBirth) {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    public static void main(String[] args) {
        System.out.println("Input your date of birth in the format: 'yyyy-MM-dd'");
        System.out.println("For example: '1990-01-01'");

        Scanner scanner = new Scanner(System.in);
        String dateOfBirth = scanner.nextLine();

        System.out.println("Your age is: " + calculateAge(LocalDate.parse(dateOfBirth)));
    }
}
