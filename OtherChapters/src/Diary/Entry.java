package Diary;
import java.time.LocalDateTime;
public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateTime;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Entry(String title, String body) {
     this(1, "title","body");
    }
    public  int getId(){

        return id;
    }

    public String getBody(){
        return body;
    }

}
