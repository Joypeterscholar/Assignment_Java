import java.util.Scanner;
public class Geometry {

	public static void main (String [] args) {
	
		Scanner inputTriangle = new Scanner(System.in);
		
		System.out.println ("Enter the three points for a traingle ");
		
		double sideX1 = inputTriangle.nextDouble();
		
		double sideY1 = inputTriangle.nextDouble();
		
		double sideX2 = inputTriangle.nextDouble();
		
		double sideY2 = inputTriangle.nextDouble();
		
		double sideX3 = inputTriangle.nextDouble();
		
		double sideY3 = inputTriangle.nextDouble();
		
		double side1 = sideX1 - sideY1;
		
		double side2 = sideX2 - sideY2;
		
		double side3 = sideX3 - sideY3;
		
		
		
		double s = (side1 + side2 + side3);
		
		
		double s2 = s / 2;
		
		double areaAll = s2 * (s2 - side1) * (s2 - side2) * (s2- side3);
		
		double areaSquareFinal = Math.sqrt(areaAll);
		
		
		
		System.out.println ("The area of the triangle is " + areaSquareFinal);
		
		
	}

}
