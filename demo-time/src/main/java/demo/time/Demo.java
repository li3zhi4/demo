package demo.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {

        // 1. LocalData 默认格式 yyyy-MM-dd
        // 2. LocalTime 默认格式 HH:mm:ss.SSS
        // 3. LocalDataTime 默认格式 yyyy-MM-ddTHH:mm:ss.SSS
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String format = now1.format(dateTimeFormatter);
        System.out.println(format);
        String str = "202010100101";
        LocalDateTime from = LocalDateTime.from(dateTimeFormatter.parse(str));
        LocalDateTime.parse(str,dateTimeFormatter);
        System.out.println(from);
        int second = from.getSecond();
        System.out.println(second);
    }
}
