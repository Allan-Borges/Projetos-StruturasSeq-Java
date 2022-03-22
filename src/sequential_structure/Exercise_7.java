package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 7) Create an algorithm that reads a real number and displays its double and
		 * the its third..
		 */

		double number = 0.0;
		double doubleNumber = 0.0;
		double thirdNumber = 0.0;

		System.out.print("Please enter a real number: ");
		number = sc.nextDouble();

		doubleNumber = number * 2;
		thirdNumber = number / 3;

		System.out.printf("The double of the number %.2f and: %.2f.%n", number, doubleNumber);
		System.out.printf("The third part of the number %.2f and %.2f.", number, thirdNumber);

		sc.close();

	}

}
