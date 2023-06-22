package Phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contact = new ArrayList<>();

    private int numOfContact;


    public boolean addContact(Contact contact1) {
        numOfContact++;
        contact.add(contact1);
        return true;
    }

    public int getSize() {
        return numOfContact;
    }

    public int getSiize() {
        return contact.size();
    }

    public String viewAllContact(List<Contact> contact) {
        return contact.toString();


    }

    public String viewAllEmergencyContact(List<Contact> contact) {
        List<Contact> emergency = new ArrayList<>();
        for (Contact cont : contact) {
            if (cont.getEmergencyContact() == true)
                emergency.add(cont);


        }
        return contact.toString();
    }

    public List<Contact> searchContacts(String keyword) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact cont : contact) {
            if (cont.getName().contains(keyword)) {
                searchResults.add(cont);
                return contact;
            }
        }

        return null;
    }

    public void delete(Contact coont) {
        contact.remove(coont);

    }

    public int deleteAll(List<Contact> contact) {
        contact = null;
        return 0;
    }

    public boolean isEmptty() {
        if (contact.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (contact.size() == numOfContact) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return contact.isEmpty();
    }

    public String validate() {

  return "oya oya, u don catch me, i no  catch complete exception"  ;}
}



