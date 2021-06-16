package HIT_LAB_2;

import java.util.Scanner;

public class AvfOfArr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements in array: ");
		int[] x = new int[n];
		for(int i=0; i<n; i++) 
				 x[i]=sc.nextInt();
		 
		float sum=0;
		for(int i=0; i<n; i++)
		 sum=sum+x[i];
		 float avg=sum/n;
		 System.out.println("Average of given numbers is "+avg);
		 }
}

