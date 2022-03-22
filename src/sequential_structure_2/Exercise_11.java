package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 11) Develop a logic that reads the values ​​of A, B, and C from an equation
		 * of the second degree and show the value of Delta.
		 */
		double x2 = 0.0;
		double x1 = 0.0;
		double delta = 0.0;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		System.out.print("Enter the value of a: ");
		a = sc.nextDouble();

		System.out.print("Enter the value of b: ");
		b = sc.nextDouble();

		System.out.print("Enter the value of c: ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * (c);
		
		if(delta > 0) {
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
			x2 = (- b - Math.sqrt(delta)) / (2 * a);
			System.out.println("x¹ " + x1);
			System.out.println("x² " + x2);
		}else if(delta == 0) {
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Only one real root! " + x1);
		}else {
			System.out.println("Has no real roots!");
		}
		
		

		sc.close();
	}

}
