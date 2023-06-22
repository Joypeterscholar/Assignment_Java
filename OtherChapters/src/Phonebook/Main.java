package Phonebook;


//import Diary.Diary;
import Diary.Entry;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Phonebook phonebook = new Phonebook();
    private static Contact contact ;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String mainMenu = """
            1-> Create Contact
            2--> Search Contact
            3-> View Contact
            4 -> Delete Contact
            4-> Exit
            """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createContact();
            case '2' -> searchContact();
            case '3' -> viewContact();
            case '4' -> deleteContact();
            default -> displayMainMenu();
        }
    }

    private static void exit() {
        display("Bye");
        System.exit(0);
    }

    private static void createContact() {

        String name = input("Enter name ");
        String phoneNo = input("Enter phone number");
        try {
            Integer.parseInt(phoneNo);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid Phone number entered. Please enter only numbers. Returning....");
            displayMainMenu();
        }
        contact = new Contact(name, phoneNo, false);
        display("Contact created");
        displayMainMenu();
    }


    private static void searchContact() {
        String keyword = input("Enter a keyword");
         String result = phonebook.searchContacts(keyword).toString();
        display(result);
        displayMainMenu();
    }
    private static void viewContact(){
        int id = Integer.parseInt(input("Enter ID: "));
        if (contact!= null) {
        display(contact.toString());
        } else {
            display("No contact found with the specified ID.");
        }
        displayMainMenu();
    }

    private static void deleteContact() {
        Contact contact1 = new Contact("NAME", "5678543", false);
        Contact contact2 = new Contact("dde", "56332543", true);
        String name = input("Enter Name: ");
        if (Objects.equals(name, contact.getName())){
            display("Contact deleted successfully");
        } else {
            display("No Contact found with the specified ID.");
        }
        displayMainMenu();
    }
    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}

