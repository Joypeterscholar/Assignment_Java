import java.util.Scanner;


public class Area{

public static void main(String args[]){

Scanner userInput=new Scanner(System.in);


double x1, x2, x3, y1, y2, y3;


System.out.println("Enter (x1,y1) of a triangle");

x1= userInput.nextInt();
y1=userInput.nextInt();

System.out.println("Enter (x2,y2) of a triangle");

x2=userInput.nextInt();
y2=userInput.nextInt();

System.out.println("Enter (x3,y3) of a triangle");

x3=userInput.nextInt();
y3=userInput.nextInput();

double side1=x1+y1;
double side2=x2+y2;
double side3=x3+y3;

System.out.println(side1,side2,side3);

double x=(side1+side2+side3);

x=x/2;


System.out.println(+x);


double area=x*(x-side1);
area=area*(x-side2);
area=area*(x-side3);
area=area*1/2;


System.out.println(+area);


}
}
