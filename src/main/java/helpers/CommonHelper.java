package helpers;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Hmayak Atayan on  25, Feb, 2021
 */
public class CommonHelper {

    private static final SecureRandom RANDOM = new SecureRandom();

    public static String getCurrentDate(String format) {
        LocalDateTime currentDate = LocalDateTime.now();
        return currentDate.format(DateTimeFormatter.ofPattern(format));
    }

    public static String getRandomDate(String fromDate, String format) {
        String[] fromMmDdYyyy = fromDate.split("/");
        LocalDate from = LocalDate.of(Integer.parseInt(fromMmDdYyyy[2]), Integer.parseInt(fromMmDdYyyy[0]), Integer.parseInt(fromMmDdYyyy[1]));
        LocalDate to = LocalDate.now();
        long days = from.until(to, ChronoUnit.DAYS);
        long randomDays = (long) (RANDOM.nextDouble() * days);
        LocalDate randomDate = from.plusDays(randomDays);
        return getDateInFormat(randomDate, format);
    }

    public static LocalDateTime getDateFromCurrentDateInRange(int daysRange) {
        LocalDateTime currentDate = LocalDateTime.now();
        return addDaysInRangeToDate(currentDate, daysRange);
    }

    public static String getDateInFormat(LocalDate date, String format) {
        return date.format(DateTimeFormatter.ofPattern(format));
    }

    public static LocalDateTime addDaysInRangeToDate(LocalDateTime date, int daysRange) {
        int randomDay = RANDOM.nextInt(Math.abs(daysRange)) + 1;
        return (daysRange > 0) ? date.plusDays(randomDay) : date.minusDays(randomDay);
    }

    public static String getRandomAlphaNumericString(int length) {
        return getRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", length);
    }

    private static String getRandomString(String charactersList, int length) {
        int size = charactersList.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (length-- != 0) {
            stringBuilder.append(charactersList.charAt(RANDOM.nextInt(size)));
        }
        return stringBuilder.toString();
    }

}
