package HIT_lab_1;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: ");
		double radius = sc.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("The Area of the Circle: "+area);
		double circumfrence = Math.PI*2*radius;
		System.out.println("The Circumfrence of the Circle: "+circumfrence);
	}

}
