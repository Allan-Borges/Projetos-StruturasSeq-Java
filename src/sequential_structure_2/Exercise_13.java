package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 13) Make an algorithm that reads an employee's salary, calculates and
		 * displays the his new salary, with a 15% increase.
		 */

		double salary = 0.0;
		double newSalary = 0.0;

		System.out.print("What is your salary? ");
		salary = sc.nextDouble();
		System.out.println();
		System.out.printf("Salary value:$%.2f%n", salary);
		System.out.println();
		newSalary = salary + salary * 15 / 100;
		System.out.printf("Salary increase:$%.2f", newSalary);

		sc.close();

	}

}
