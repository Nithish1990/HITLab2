package HIT_lab_1;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Triangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter the height of the Triangle: ");
		double height = sc.nextDouble();
		double area = (length*height)*0.5;
		System.out.println("The Area of the Triangle: "+area);
		
		
	}

}



