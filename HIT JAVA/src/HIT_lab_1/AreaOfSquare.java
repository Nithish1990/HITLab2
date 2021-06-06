package HIT_lab_1;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Square: ");
		double length = sc.nextDouble();		
		double area = length*length;
		System.out.println("The Area of the Square: "+area);
		
		
	}

}
