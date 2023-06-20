import java.util.*;

abstract class Shape {
	int length, breadth;

	Scanner input = new Scanner(System.in);

	abstract void printArea();

}

class Rectangle extends Shape {
	void printArea() {
		System.out.println(" Area of Rectangle ");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}
public class Exp_8a {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		
	}
} 
