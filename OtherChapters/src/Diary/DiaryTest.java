package Diary;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
    Diary diary = new Diary("userName", "password");
    @Test
    public void testForDiary(){
        assertNotNull(diary);
    }
    @Test
    public void testForDiaryLockedByDefault(){
        assertTrue(diary.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void lockedDiaryCannotBeUnlockedWithWrongPasswordTest(){
        assertTrue(diary.isLocked());
        diary.unlockWith("wrong password");
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanBeLockedTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiaryCanCreateEntryTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Title", "Body");
        assertEquals(1, diary.countEntries());
    }

    @Test
    public void createEntryfindEntriesByIdTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        Entry entry = diary.findEntriesById(1);
        assertEquals("body", entry.getBody());

    }
    @Test
    public void createEntry(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
     Entry entry = diary.findEntriesById(1);
     assertEquals(1, entry.getId());

    }
    @Test
    public void createEntry2(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.createEntry("hello", "bodie");
        Entry entry = diary.findEntriesById(2);
        assertEquals(2, entry.getId());
    }
}