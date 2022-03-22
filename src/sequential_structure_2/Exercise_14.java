package sequential_structure_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 14) The car rental company needs your help to charge for their services.
		 * Write a program that asks the number of km traveled by a rented car and the
		 * number of days for which it was rented. Calculate the total price to pay,
		 * knowing that the car costs R$90 per day and R$0.20 per km driven.
		 */

		double kmTraveled = 0.0;
		double rantedDays = 0.0;
		double carRental = 90.0;
		double kmDriven = 0.20;
		double totalPrice = 0.0;

		System.out.print("How many kilometers were traveled? ");
		kmTraveled = sc.nextDouble();
		System.out.println();
		System.out.print("How many days was the car rented? ");
		rantedDays = sc.nextDouble();
		System.out.println();
		totalPrice = (carRental * rantedDays) + (kmTraveled * kmDriven);
		System.out.printf("The total price is:$%.2f",totalPrice);
		sc.close();

	}

}
