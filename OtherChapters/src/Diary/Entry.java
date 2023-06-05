package Diary;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateTime = LocalDateTime.now();

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Entry(String title, String body) {

        this(1, "title","body");
    }
    public void setId(int id){
        this.id = id;
    }
    public  int getId(){

        return id;
    }

    public String getBody(){
        return body;
    }

    public LocalDateTime getDateCreated() {
        return dateTime;
    }
    @Override
    public String toString(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm:ss a");
        String date = df.format(dateTime);
        return String.format("""
                Gist! Gist!! Gist!!!
                Title: %s
                DateCreated: %s
                Body: %s
                """, title, date, body);
    }
}
