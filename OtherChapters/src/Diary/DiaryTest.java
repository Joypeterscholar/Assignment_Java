package Diary;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
        Diary diary = new Diary("userName", "password");

    @Test
    public void testForDiary() {
        assertNotNull(diary);
    }

    @Test
    public void testForDiaryLockedByDefault() {
        assertTrue(diary.isLocked());
    }

    @Test
    public void lockedDiaryCanBeUnlocked() {
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void lockedDiaryCannotBeUnlockedWithWrongPasswordTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("wrong password");
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanBeLockedTest() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanCreateEntryTest() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Title", "Body");
        assertEquals(1, diary.countEntries());
    }

    @Test
    public void createEntryfindEntriesByIdTest() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        Entry entry = diary.findEntriesById(1);
        assertEquals("body", entry.getBody());

    }

    @Test
    public void createEntry() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        Entry entry = diary.findEntriesById(1);
        assertEquals(1, entry.getId());

    }

    @Test
    public void gistSouldHaveATime() {
        diary.unlockWith("password");
        diary.createEntry("title", "body");
        Entry entry = diary.findEntriesById(1);
        assertNotNull(entry.getDateCreated());
        LocalDateTime time = LocalDateTime.now();
        //assertEquals(time, entry.getDateCreated().toLocalDate());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm:ss a");
        String gistTimeStamp = df.format(entry.getDateCreated());
        String currentTimeStamp = df.format(time);
        assertEquals(currentTimeStamp, gistTimeStamp);
    }

    @Test
    public void deleteEntry() {
        diary.unlockWith("password");
        diary.createEntry("title", "body");
        assertEquals(1, diary.countEntries());
        diary.deleteGistById(1);
        assertEquals(0, diary.countEntries());
        assertNull(diary.findEntriesById(1));

    }
    @Test
    public void updateGist(){
        diary.unlockWith("password");
        diary.createEntry("title", "body");
        diary.updateEntry("title", "body");
        Entry updateGist =diary.findEntriesById(1);

    }
}