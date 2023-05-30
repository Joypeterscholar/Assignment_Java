import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sales;
        int totalSales = 0;
        int counter = 0;
        while (counter < 5) {
            System.out.println("enter sale for product" + (counter));
            sales = input.nextInt();
            totalSales = totalSales + sales;
            counter = counter + 1;
            System.out.println("counter is now" + (counter));
            System.out.println("sales is now" + sales);
            System.out.println("total sales is now" + totalSales);
            System.out.println("\n");
            System.out.println("total sales is " + totalSales);
        }
    }
}