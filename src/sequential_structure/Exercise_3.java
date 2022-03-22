package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 3) Create a program that reads an employee's name and salary, showing in the
		 * end a message
		 */

		 String employeeName;
		 double employeeSalary = 0;
		
		 System.out.print("What's your name?");
		 employeeName = sc.nextLine();
		 
		 System.out.print("What's your salary?");
		 employeeSalary = sc.nextDouble();
		 
		 System.out.printf("The employee %s have salary : $%.2f ",employeeName,employeeSalary );
		 
		sc.close();
	}

}
