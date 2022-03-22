package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 15) Create a program that reads the number of days worked in a month and
		 * displays the salary of an employee, knowing that he works 8 hours a day and
		 * earns R$25 per hour worked.
		 */

		double salary = 0.0;
		int daysWorked = 0;
		int hoursWorked = 8;
		double valueHoursWorked = 25;

		System.out.print("How many days do you work in the month? ");
		daysWorked = sc.nextInt();

		salary = daysWorked * hoursWorked * valueHoursWorked;
		System.out.printf("You salary:$%.2f",salary);
		
		sc.close();
	}

}
