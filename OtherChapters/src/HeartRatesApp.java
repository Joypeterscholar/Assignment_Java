import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HeartRates heartRates = new HeartRates("joy", "peter", "03-apr-2000" );
        System.out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();
        heartRates.setFirstName(firstName);
        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();
        heartRates.setLastName(lastName);
        System.out.println("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();
        heartRates.setDateOfBirth(dateOfBirth);
        System.out.println("first name is " +heartRates.getFirstName());
        System.out.println("last name is " +heartRates.getLastName());
        System.out.println("date of birth is " +heartRates.getDateOfBirth());
        System.out.println("Your age is " + heartRates.getAge());
        System.out.println("Your heart rate is " + heartRates.getMaximumHeartRate());
        System.out.println("Your target rate is " + heartRates.getTargetHeartRate());
    }
}
