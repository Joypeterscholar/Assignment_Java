package Phonebook;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    Contact contact = new Contact("name", "phone number", false);

    @Test
    public void testThatContactExist() {
        contact = new Contact("name", "phonenumber", false);
        Assert.assertNotNull(contact);
    }
    @Test
    public void testThatNameExist() {
        contact = new Contact("name", "phonenumber", false);
        assertEquals("name", contact.getName());
    }

    @Test
    public void testThatNumberExist() {
        contact = new Contact("name", "phonenumber", false);
        assertEquals("phonenumber", contact.getPhoneNumber());
    }

    @Test
    public void testToString() {
        contact = new Contact("name", "phonenumber", false);
        String expected = "Contact {name = 'name', phonenumber = 'phonenumber', emergencyContact = false}";
        String actual = contact.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testThatNumberCantBeString(){
        contact = new Contact("name", "08038483080", false);
        assertEquals("08038483080", contact.getPhoneNumber());
    }
}
