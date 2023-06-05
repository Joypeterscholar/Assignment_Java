//package Diary;
//
//import javax.swing.*;
//import java.util.Scanner;
//
//public class Main {
//    private Scanner keyboardInput = new Scanner(System.in);
//    private static Diary diary;
//
//    public static void main(String[] args) {
//        displayMainMenu();
//    }
//
//    public static void displayMainMenu() {
//        String mainMenu = """
//                Welcome to our diary
//                1-> Create Diary
//                2--> exit
//                """;
//        String userInput = input(mainMenu);
//        switch (userInput.charAt(0)) {
//            case '1'-> createDiary();
//            case '2'-> login();
//            case '3'-> exit();
//            default -> displayMainMenu();
//
//        }
//    }
//
//
//
//    private static char login() {
//        return 0;
//    }
//
//    private static void exit() {
//        display("thanks for using our application");
//    }
//
//    private static void createDiary() {
//        String username = input("enter username");
//        String password = input("enter username");
//        diary = new Diary(username, password);
//        display("diary created");
//        openDiaryNow();
//    }
//
//    private static void openDiaryNow() {
//        String menuItem = """
//                1 -> Create Gist
//                2 -> View gist by title
//                3 -> delete gist by title
//                4 -> update gist
//                5 -> exit
//
//                """;
//        char userResponse = input(menuItem).charAt(0);
//        switch (userResponse) {
//            case '1' -> createGist();
//            case '2' -> viewGist();
//            case '3' -> deleteGist();
//            case '4' -> updateGist();
//            case '5' -> exit();
//            default -> openDiaryNow();
//        }
//    }
//
//    private static void updateGist() {
//
//        String title = input("enter a title");
//        String body = input("enter a body");
//        diary.updateEntry(title, body);
//        display("gist updated successfully");
//
//    }
//
//    private static void deleteGist() {
//    }
//
//    private static void viewGist() {
//        String id = input("enter an id");
//        Entry entry = diary.findEntriesById(2);
//        display(entry.toString());
//        openDiaryNow();
//    }
//
//    private static void createGist() {
//        String title = input("enter a title");
//        String body = input("enter a body");
//        diary.addEntry(title, body);
//        display("Gist created sucessfully ");
//
//    }
//
//    private static void display(String message) {
//        JOptionPane.showMessageDialog(null, message);
//    //    System.out.println(message);
//    }
//
//    public static String input(String prompt) {
//       return JOptionPane.showInputDialog(prompt);
////        display(prompt);
////        return keyboardInput.nextLine();
//    }
//}
//
