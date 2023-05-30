import java.util.Scanner;

public class ReadInt{
    public static void main(String[] args) {
        int x;
        int y;
        int a;
        int count= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter input ");
        x = input.nextInt();
        y = x;
        while (x > 0){
            x = x / 10;
            count++;
        }
        while (y > 0){
            a = y % 10;
            System.out.println("a at "+count+" is: "+a);
            y = y/10;
            count--;
        }
        }


        }
