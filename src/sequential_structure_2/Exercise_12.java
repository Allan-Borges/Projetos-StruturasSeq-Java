package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 12) Create a program that reads the price of a product, calculates and
		 * displays its PROMO PRICE, with 5% discount.
		 */
		double priceDiscount = 0.0;
		double priceProduct = 0.0;

		System.out.print("What is the price of the product? ");
		priceProduct = sc.nextDouble();
		System.out.printf("Price:$%.2f%n",priceProduct);

		priceDiscount = priceProduct + priceProduct * 5 / 100;
		System.out.printf("Discount value:$%.2f",priceDiscount);
		sc.close();
	}

}
