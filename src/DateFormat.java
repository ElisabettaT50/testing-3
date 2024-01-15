/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        String date1 = "2023-03-01T13:00:00Z";
        formatDateString(date1);

    }
    public static void formatDateString(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        OffsetDateTime dateTime = OffsetDateTime.parse(date);
        String formattedDate = dateTime.format(dateTimeFormatter);
        System.out.println(formattedDate);
    }
}