package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 8) Develop a program that reads a distance in meters and displays the values
		 * relative in other measures
		 */

		double km, dm, hm, dam, cm, mm, m = 0.0;

		System.out.print("Enter the distance in meters: ");
		m = sc.nextDouble();

		km = m / 1000;
		dm = m * 10;
		hm = m / 100;
		dam = m / 10;
		cm = m * 100;
		mm = m * 1000;

		System.out.println();
		System.out.printf("The converted meter distance %.2f%n:", m);
		System.out.println();
		System.out.printf("Km %.2f%n", km);
		System.out.printf("Dm %.2f%n", dm);
		System.out.printf("Hm %.2f%n", hm);
		System.out.printf("Dam %.2f%n", dam);
		System.out.printf("Cm %.2f%n", cm);
		System.out.printf("Mm %.2f%n", mm);

		sc.close();
	}
}
