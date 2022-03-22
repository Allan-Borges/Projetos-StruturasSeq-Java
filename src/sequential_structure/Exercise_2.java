package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* 2) Make a program that reads a person's name and displays a welcome message
		 * for them:
		 */
		
		String name;
		System.out.print("What's your name?");	
		name = sc.nextLine();
		System.out.println(" -----!! Welcome !!-----  ");
		System.out.println(name);
		sc.close();

	}

}
