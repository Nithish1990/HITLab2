package HIT_lab_1;

public class Armstrong {
	public static void main(String [] args) {
		int num = 153, number = num, remainder, result = 0;
		while (number !=0) {
			remainder = number %10;
			result += Math.pow(remainder, 3);		
			number /=10;
			}
		
		if (num == result) {
			System.out.println("Yes, "+num+" is a armstrong number");
		}else {
			System.out.println("No, "+num+" is not an armstrong number");
		}
	}
}



