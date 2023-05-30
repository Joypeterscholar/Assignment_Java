package Snacks2;
import java.util.Scanner;

public class Mbti {
    private static final int NoOfQuestion = 20;
    private static final String[] Question = {
            "1. A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one.",
            "2. A. Interpret literally. B. Look for meaning and possibilities",
            "3. A. Logical thinking, questioning. B. empathetic, feeling, accomodating",
            "4. A. Organized, orderly. B. Flexible and adaptable",
            "5. A. More outgoing, think out loud. B. More reserved, think to yourself",
            "6. A. Pratical, realistic, experimental. B. Imaginative, innovative, theoritical",
            "7. A. Candid, straightforward, frank. B. Tactful, kind, encouraging",
            "8. A. Plan, schedule. B. Unplanned, spontaneous",
            "9. A. seek many tasks, public activities, interaction with others. B. seek private, solitary activities with quiet to concentrate",
            "10. A. Standard, usual, conventional. B. different, novel, unique",
            "11. A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
            "12. A. regulated, structured. B. easy-going, live and let live",
            "13. A. external, communicative, express yourself. B. internal, reticent, keep to yourself",
            "14. A. focus on here and now. B. look to the future, global perspective, big picture",
            "15. A. tough-minded, just. B. tender-hearted, merciful",
            "16. A. preparation, plan ahead. B. Go with the flow, adapt as you go",
            "17. A. Active, initiate. B. Reflective, deliberate",
            "18. A. facts, things, what is. B. ideas, dreams, what could be, philosophical",
            "19. A. matter of fact, issue oriented. B. sensitive, people oriented, compassionate",
            "20. A. control, govern. B. Latitude, freedom"
    };
    private static final String[] Trait = new String[]{"THIS IS COOL"};


    public static void main(String[] args) {
        String[] userResponses = new String[NoOfQuestion];
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String answer = scanner.nextLine();

        for (int i = 0; i < NoOfQuestion; i++) {
            System.out.println(Question[i]);
            System.out.print(answer);
            System.out.println(" -> Select A or B: ");
            String response = scanner.nextLine();

            while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
                System.out.println("Invalid input. Please select A or B.");
                System.out.print("Select A or B: ");
                response = scanner.nextLine();
            }

            userResponses[i] = response.toUpperCase();
        }

        scanner.close();

        System.out.println("User Responses:");
        for (int i = 0; i < NoOfQuestion; i++) {
            System.out.println((i + 1) + ". " + userResponses[i]);
        }

        int randomIndex = (int) (Math.random() * Trait.length);
        String personalityTrait = Trait[randomIndex];

        System.out.println("Personality Trait:");
        System.out.println(personalityTrait);
    }
}