package org.gradle;

import java.util.Scanner;

/**
 * Created by kgalligan on 12/2/15.
 */
public class App
{
	public static void main(String[] args)
	{
		// write a function that accepts a variable: age
		// if age is greater than 21, display "Yay, have a beer!"
		// if age is less than 21, display "Nay, don't have a beer!"

		// ask for the user's age
		System.out.print("What is your age? ");

		// store the user input in a variable: user_age
		Scanner inp = new Scanner(System.in);
		int userAge = Integer.parseInt(inp.nextLine());

		// run the function
		canHazBeer(userAge);
	}

	static void canHazBeer(int age)
	{
		if(age >= 21)
			System.out.println("Yay, have a beer!");
		else
			System.out.println("Nay, don't have a beer!");
	}
}


