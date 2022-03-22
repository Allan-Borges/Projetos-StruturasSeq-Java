package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * 9) Make an algorithm that reads how much money a person has in their wallet
		 * (in BRL) and show how many dollars she can buy. Consider $1.00 = $3.45.
		 */

		double moneyReal = 0.0;
		double moneyDolar = 0.0;

		System.out.print("How many reais do you have? ");
		moneyReal = sc.nextDouble();

		moneyDolar = moneyReal / 3.45;

		System.out.printf("You could by $%.2f dollars.", moneyDolar);

		sc.close();

	}

}
