package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateTime;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm:ss a");
        String formattedDateTime = dateTime.format(formatter);
        return String.format("""
                Gist! Gist!! Gist!!!
                ID: %d
                Title: %s
                DateCreated: %s
                Body: %s
                """, id, title, formattedDateTime, body);
    }
    public LocalDateTime getDateCreated() {
        return dateTime;
 }

}