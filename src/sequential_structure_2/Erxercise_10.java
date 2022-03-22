package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Erxercise_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 10) Write an algorithm that reads the width and height of a wall, calculates
		 * and show the area to be painted and the amount of paint needed for the job,
		 * knowing that each liter of paint paints an area of ​​2 square meters.
		 */

		double litersPaint = 0.0;
		double heightWall = 0.0;
		double widthWall = 0.0;
		double areaPaint = 0.0;

		System.out.print("What is the width of the wall? ");
		widthWall = sc.nextDouble();

		System.out.print("What is the height of the wall? ");
		heightWall = sc.nextDouble();

		areaPaint = heightWall * widthWall;

		System.out.printf("The area to be painted and: %.2fm²%n", areaPaint);

		litersPaint = areaPaint / 2;

		System.out.println("Will be necessary " + litersPaint + " liters to paint: " + areaPaint + "m²");
		sc.close();
	}

}
