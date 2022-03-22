package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 4) Develop an algorithm that reads two integers and displays the sum between
		 * them.
		 */
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.print("Enter a number integer: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter a number integer: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("The sum enter two numbers and : " + sum);
		
		sc.close();
	}

}
