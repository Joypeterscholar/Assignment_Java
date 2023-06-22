package Diary;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
class Diary {
    private boolean isLocked = true;
    private String username;
    private String password;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean unlockWith(String password) {
        if (password.equals(this.password)) {
            isLocked = false;
            return true;
        }
        return false;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(getNextEntryId(), title, body);
        entries.add(entry);
    }

    public Entry viewEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public boolean deleteEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }

    public boolean updateEntry(int id, String newTitle, String newBody) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entry.setTitle(newTitle);
                entry.setBody(newBody);
                return true;
            }
        }
        return false;
    }

    public int countEntries() {
        return entries.size();
    }

    private int getNextEntryId() {
        return entries.size() + 1;
    }
    public void lock() {
        isLocked = true;
   }
    public Entry findEntriesById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id)
                return entry;
        }
        return null;
    }

    public String viewAll(){
        return entries.toString();

    }
}