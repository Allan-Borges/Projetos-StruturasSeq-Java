package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 16)Write a program to calculate the reduction in the lifetime of a smoker.
		 * Ask how many cigarettes he smoked per day and how old he already smoked.
		 * Assume that a smoker loses 10 minutes of life with each cigarette. calculate
		 * how many days of life a smoker will lose and display the total in days.
		 */

		double totalDays = 0;
		int smokeHours = 0; 
		int numberCigarrets = 0;
		int yearsSmoked = 0;

		System.out.print("How many cigarettes smoked per day? ");
		numberCigarrets = sc.nextInt();

		System.out.print("How many years did your smoked? ");
		yearsSmoked = sc.nextInt();
		
		smokeHours = numberCigarrets  * 10 / 60;
		totalDays = smokeHours * yearsSmoked * 365 / 24;

		System.out.println("Total days: " + totalDays);

		sc.close();
	}
}
