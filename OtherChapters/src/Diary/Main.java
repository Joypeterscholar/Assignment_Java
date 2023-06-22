package Diary;

import javax.swing.*;

public class Main {
    private static Diary diary;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String mainMenu = """
                Welcome to our diary
                1 -> Create Diary
                2 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createDiary();
            case '2' -> exit();
            default -> displayMainMenu();
        }
    }

    private static void exit() {
        display("Thanks for using our application");
        System.exit(0);
    }

    private static void createDiary() {
        String username = input("Enter username");
        String password = input("Enter password");
        diary = new Diary(username, password);
        display("Diary created");
        unlockDiary();
    }

    private static void unlockDiary() {
        String password = input("Enter password to unlock the diary");
        if (diary.unlockWith(password)) {
            display("Diary unlocked");
            openDiaryNow();
        } else {
            display("Invalid password. Please try again.");
            unlockDiary();
        }
    }

    private static void openDiaryNow() {
        String menuItem = """
                1 -> Create Gist
                2 -> View Gist by ID
                3 -> Delete Gist by ID
                4 -> Update Gist
                5 -> View All Gist
                6 -> Exit
                """;
        char userResponse = input(menuItem).charAt(0);
        switch (userResponse) {
            case '1' -> createGist();
            case '2' -> viewGist();
            case '3' -> deleteGist();
            case '4' -> updateGist();
            case '5' -> viewAllGist();
            case '6' -> exit();
            default -> openDiaryNow();
        }
    }

    private static void createGist() {
        String title = input("Enter a title");
        String body = input("Enter a body");
        diary.createEntry(title, body);
        display("Gist created successfully");
        openDiaryNow();
    }

    private static void viewGist() {
        int id = Integer.parseInt(input("Enter ID: "));
        Entry entry = diary.viewEntryById(id);
        if (entry != null) {
            display(entry.toString());
        } else {
            display("No entry found with the specified ID.");
        }
        openDiaryNow();
    }
    private static void viewAllGist(){
       display( diary.viewAll());
       openDiaryNow();
    }

    private static void deleteGist() {
        int id = Integer.parseInt(input("Enter ID: "));
        if (diary.deleteEntryById(id)) {
            display("Gist deleted successfully");
        } else {
            display("No entry found with the specified ID.");
        }
        openDiaryNow();
    }

    private static void updateGist() {
        int id = Integer.parseInt(input("Enter ID: "));
        String newTitle = input("Enter new title");
        String newBody = input("Enter new body");
        if (diary.updateEntry(id, newTitle, newBody)) {
            display("Gist updated successfully");
        } else {
            display("No entry found with the specified ID.");
        }
        openDiaryNow();
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}

