package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 6) Write a program that reads an integer and displays its predecessor and its
		 * successor.
		 */
		
		int predecessor = 0;
		int number = 0;
		int sucessor = 0;
		
		System.out.print("Enter a integer number : ");
		number = sc.nextInt();
		
		predecessor = number - 1;
		sucessor = number + 1;
		
		System.out.println("The predecessor : " +  number  + " of " + predecessor );
		System.out.println("The sucessor : " + number + " of " + sucessor );
		
		sc.close();

	}

}
