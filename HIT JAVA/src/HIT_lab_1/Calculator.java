package HIT_lab_1;

import java.util.Scanner;

public class Calculator  {
	 public static void main(String[] args) {
		 char operator;
		 double numb1, num2, result;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Choose an operator: +, -, *, or /");
		 operator = sc.next().charAt(0);
		 System.out.println("Enter first number");
		 numb1 = sc.nextDouble();
		 System.out.println("Enter first number");		 
		 num2 = sc.nextDouble();
		 switch(operator) {
		 case '+':
			 System.out.println(numb1+" "+operator+" "+ num2+" = "+(numb1+num2));
			 break;
		 case '-':
			 System.out.println(numb1+" "+operator+" "+ num2+" = "+(numb1-num2));
			 break;
		 case '*':
			 System.out.println(numb1+" "+operator+" "+ num2+" = "+(numb1*num2));
		 	break;
		 case '/':
			 System.out.println(numb1+" "+operator+" "+ num2+" = "+(numb1/num2));
		 	break;
		 default:
			 System.out.println("Invalid operator!");
			 break;			 
		 }		
		 
	 }
}





