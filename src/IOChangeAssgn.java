
import java.util.Scanner;
	
public class IOChangeAssgn {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("First Temperature?");
		num1=keyboard.nextInt();
		System.out.print("Seccond temperature?");
		num2=keyboard.nextInt();
		System.out.println("The max value is : " + Math.max(num1, num2));
		
	}
}
