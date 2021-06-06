package HIT_lab_1;

import java.util.Scanner;

public interface ReveseTheNumber {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int Rnum = 0,n = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num !=0) {
			Rnum = Rnum*10;
			Rnum = Rnum +num%10;
			num /= 10;
			
		}
		System.out.print("Reveresed Number : ");
		System.out.println(Rnum);
	}
	

}
