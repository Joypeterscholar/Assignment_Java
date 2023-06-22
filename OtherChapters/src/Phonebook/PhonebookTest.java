package Phonebook;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    Phonebook phonebook = new Phonebook();
    private List<Contact> contact = new ArrayList<>();


    @Test
    public void testThatPhoneBookExist() {
        phonebook = new Phonebook();
        assertNotNull(phonebook);
    }

    @Test
    public void testThatContactExistInPhoneBook() {
        phonebook = new Phonebook();
        assertNotNull(20);
    }

    @Test
    public void testThatICanAddContact() {
        phonebook = new Phonebook();
        Contact contact1 = new Contact("name", "phonenumber", false);
        assertEquals(true, phonebook.addContact(contact1));
    }

    @Test
    public void testThatForCurrentSize() {
        phonebook = new Phonebook();
        Contact contact1 = new Contact("name", "phonenumber", false);
        Contact contact2 = new Contact("tt", "phonenber", false);
        Contact contact3 = new Contact("hhme", "phenumber", false);
        Contact contact4 = new Contact("lolme", "phonumber", false);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        assertEquals(4, phonebook.getSize());
    }

    @Test
    public void testToViewAllContact() {
        phonebook = new Phonebook();
        Contact contact1 = new Contact("name", "phonenumber", false);
        Contact contact2 = new Contact("tt", "phonenber", false);
        Contact contact3 = new Contact("hhme", "phenumber", false);
        Contact contact4 = new Contact("lolme", "phonumber", false);
        contact.add(contact1);
        contact.add(contact2);
        contact.add(contact3);
        contact.add(contact4);
        String actual = "[" + "" + contact1 + ", " + contact2 + ", " + contact3 + ", " + contact4 + "]";
        String expected = phonebook.viewAllContact(contact);
        assertEquals(expected, actual);
    }

    @Test
    public void testToViewEmergencyContact() {
        phonebook = new Phonebook();
        Contact contact1 = new Contact("name", "phonenumber", true);
        Contact contact2 = new Contact("tt", "phonenber", true);
        contact.add(contact1);
        contact.add(contact2);
        String actual = "[" + "" + contact1 + ", " + contact2 + "]";
        String expected = phonebook.viewAllEmergencyContact(contact);
        assertEquals(expected, actual);
    }


    @Test
    public void testToSearchForContact() {
        Phonebook phonebook = new Phonebook();
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("joy", "08022334455", true);
        Contact contact2 = new Contact("joy", "08022334455", true);
        Contact contact3 = new Contact("joy3", "08022334455", true);
        Contact contact4 = new Contact("emily", "09055446633", true);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        String expeted = "[Contact {name = 'joy', phonenumber = '08022334455', emergencyContact = false}, Contact {name = 'joy', phonenumber = '08022334455', emergencyContact = false}, Contact {name = 'joy3', phonenumber = '08022334455', emergencyContact = false}, Contact {name = 'emily', phonenumber = '09055446633', emergencyContact = false}]";
        assertEquals(expeted, phonebook.searchContacts("jo").toString());
    }

    @Test
    public void testToDeleteContact() {
        Phonebook phonebook = new Phonebook();
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("joy", "08022334455", true);
        Contact contact2 = new Contact("joy2", "08022334455", true);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.delete(contact1);
        int expectedSize = 1;
        int actualSize = phonebook.getSiize();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testToDeleteAllContact() {
        Phonebook phonebook = new Phonebook();
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("joy", "08022334455", true);
        phonebook.addContact(contact1);
        Contact contact2 = new Contact("joy2", "08022334455", true);
        phonebook.addContact(contact2);
        phonebook.deleteAll(contacts);
        int expectedSize = 0;
        int actualSize = phonebook.deleteAll(contacts);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testIsEmpty() {
        Phonebook phonebook = new Phonebook();
        assertTrue(phonebook.isEmpty());
        Contact contact = new Contact("joy", "08022334455", true);
        phonebook.addContact(contact);
        assertFalse(phonebook.isEmpty());
        phonebook.delete(contact);
        assertTrue(phonebook.isEmpty());
    }

    @Test
    public void testIsFull() {
        Phonebook phonebook = new Phonebook();
        Contact contact1 = new Contact("joy", "08022334455", true);
        Contact contact2 = new Contact("joy2", "08022334456", true);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        assertTrue(phonebook.isFull());
        Contact contact3 = new Contact("joy3", "08022334457", true);
        phonebook.addContact(contact3);
        assertTrue(phonebook.isFull());
    }
}

