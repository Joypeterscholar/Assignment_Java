import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mile = 0;
        int trip = 0;
        double newMilePerGallon = 0;

        while (mile != -1) {
            System.out.print("Enter the number of miles driven or enter -1 to end: ");
            mile = input.nextInt();

            if (mile == -1) {
                System.out.println("Bye!");
                break;
            } else {

                if (mile > 0) {


                    System.out.println();

                    System.out.print("Enter the number of gallons used: ");
                    int gallon = input.nextInt();

                    if (gallon > 0) {

                        System.out.println();

                        double milePerGallon = (double) mile / gallon;
                        ++trip;

                        System.out.printf("For this trip, you used %.2f gallons for every mile%n%n", milePerGallon);

                        newMilePerGallon += milePerGallon;
                    }
                    else {
                        System.out.println("Enter a valid number!");
                    }

                    System.out.printf("For the total of %d trips, you used %.2f gallons for every mile%n%n", trip, newMilePerGallon);
                } else {
                    System.out.println("Enter a valid number of miles.");
                }
            }
        }
    }
}