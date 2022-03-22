package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * 5) Make a program that reads a student's two grades in a subject and shows
		 * your average in the subject on the screen.
		 */

		double avg = 0.0;
		double note1 = 0.0;
		double note2 = 0.0;

		System.out.print("Enter the first note: ");
		note1 = sc.nextDouble();

		System.out.print("Enter the second note: ");
		note2 = sc.nextDouble();

		avg = (note1 + note2) / 2;

		System.out.println("Your average and: " + avg);

		sc.close();

	}

}
