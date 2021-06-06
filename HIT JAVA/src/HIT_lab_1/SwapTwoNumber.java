package HIT_lab_1;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		System.out.println("Before Swap");
		System.out.println("Number 1 = "+num1+", Number 2 = "+num2);
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println("After Swap");
		System.out.println("Number 1 = "+num1+", Number 2 = "+num2);
		
	}

}
