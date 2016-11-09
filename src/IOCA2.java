import java.util.Scanner;

public class IOCA2 {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, num3;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();
		num3 = (num1 +num2)/2;
		System.out.print("The average is : " + num3);
	}
	
}
