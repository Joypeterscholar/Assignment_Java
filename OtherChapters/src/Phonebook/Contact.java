package Phonebook;

import javax.management.StringValueExp;

public class Contact {


    private String name;
    private String phoneNumber;
    private boolean emergencyContact;

    public Contact(String name, String phoneNumber, boolean emergencyContact) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emergencyContact = false;

    }

    public String getName() {
        return name;
    }
    public boolean getEmergencyContact() {
        return emergencyContact;
    }

    public String getPhoneNumber() {
        validateContactNumber();
        return phoneNumber;
    }


    public String toString() {
     return "Contact {" + "" + "name = '" + name + "'" + ", phonenumber = '" + phoneNumber + "'" + ", emergencyContact = " + emergencyContact + "" + '}';
    }



    public void validateContactNumber() {
        try {
            Integer.parseInt(phoneNumber);

        } catch (NumberFormatException numberFormatException) {
            System.out.println(("Invalid phone number entered. Please enter only numbers. Returning.."));
        }

    }
}