package day4.fixedtext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public String getCurrentDateTime() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm:ss a");
        return LocalDateTime.now().format(formatter);
    }
}
