import java.util.Scanner;
public class Condition{

public static void main (String args[]){

Scanner userInput=new Scanner(System.in);

System.out.println("enter the first number");
int x=userInput.nextInt();


System.out.println("enter the second number");
int y=userInput.nextInt();


if (x==y){
System.out.printf("%d==%d%n", x,y);
}
else if (x!=y){
System.out.printf("%d!=%d%n", x,y);
}


}
}
