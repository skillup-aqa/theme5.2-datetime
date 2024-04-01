package ua.skillup;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class ConvertorToTimeZone {

    public static ZonedDateTime convertToTimezone(ZonedDateTime time, String timezone) {
        // TODO: implement this method
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Input the timezone in the format: 'Europe/Kiev'");
        System.out.println("See the list of available timezones here: https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/");

        Scanner scanner = new Scanner(System.in);
        String timezone = scanner.nextLine();

        System.out.println("Current time in " + timezone + " is: " + convertToTimezone(ZonedDateTime.now(), timezone));
    }
}
