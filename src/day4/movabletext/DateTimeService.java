package day4.movabletext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeService {

    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm:ss a");

    public String getCurrentDateTime() {
        return LocalDateTime.now().format(formatter);
    }
}

