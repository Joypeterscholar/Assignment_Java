package Diary;

import java.util.ArrayList;
        import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String username;
    private String password;
    private int gistCounter = 0;
    List<Entry> Diaries = new ArrayList<>();


    public Diary(String userName, String password) {

        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if (passwordIsCorrect) unlockDiary();

    }

    private boolean unlockDiary() {
        return isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(title, body);
        Diaries.add(entry);
    }

    public int countEntries() {
        return Diaries.size();
    }

    public Entry findEntriesById(int id) {
        for (Entry entry : Diaries) {
            if (entry.getId() == id)
                return entry;
        }
        return null;
    }

    public void deleteGistById(int id) {
      Entry entry = findEntriesById(1);
                Diaries.remove(entry);
            }

    public void updateEntry(String title, String body) {
  if (!isLocked)updateEntryWith(title,body);
    }
    private void updateEntryWith(String title, String body) {
        Entry findEntry = findEntriesById(1);
        findEntry.setId(1);
    }

    public void addEntry(String title, String body) {
    }
}

