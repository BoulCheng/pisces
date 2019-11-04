package so.dian.pisces.common.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateUtils {


    public static LocalDate str2LocalDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String minusDays(String date,Integer day){
        return str2LocalDate(date).minusDays(day).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String minusDays(LocalDate date, Integer day) {
        return date.minusDays(day).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String plusDays(LocalDate date, Integer day) {
        return date.plusDays(day).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String localDate2Str(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String localDateTimeparse2Str(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static Date localDateParse2Date(LocalDate localDate){
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }

    public static Date localDateTimeParse2Date(LocalDateTime localDateTime){
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

}
