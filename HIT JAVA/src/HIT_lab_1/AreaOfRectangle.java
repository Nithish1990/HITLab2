package HIT_lab_1;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the Rectangle: ");
		double width = sc.nextDouble();
		double area = length*width;
		System.out.println("The Area of the Rectangle: "+area);
		
		
	}

}
