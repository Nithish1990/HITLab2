package HIT_LAB_2;
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary
{
	public static void main (String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Current Salary: ");
		double CurrentSalary = sc.nextDouble();		
		double Raise=0;
		System.out.println("Enter the Performance Rating(Excellent,Good,Poor): ");
		String Rating = sc.next(); 
		double NewSalary = CurrentSalary + Raise;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: "+money.format(CurrentSalary));
		System.out.println("Amount of your raise: "+money.format(Raise));
		System.out.println("Your new salary: "+money.format(NewSalary));
		System.out.println();
	}
}	