
// Tessa Biava
// CST-105
// June 15th,2019
// This is my own work

import java.util.Scanner;
// importance of placement

public class Sums {

	public static void main(String[] args) {

		int placeholder1;
		int placeholder2;
		int placeholder3;
		int placeholder4;
		int placeholder5;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int fifthNumber;
		int total;
			//accidentally kept declaring originalNumber twice
		// Create a scanner
		Scanner input = new Scanner(System.in);

		// asking for input from user
		System.out.print("Enter a 5-digit positive integer: ");
		int originalNumber = input.nextInt();

		// compute
		placeholder1 = originalNumber / 10;
		firstNumber = originalNumber % 10;

		placeholder2 = placeholder1 / 10;
		secondNumber = placeholder1 % 10;

		placeholder3 = placeholder2 / 10;
		thirdNumber = placeholder2 % 10;

		placeholder4 = placeholder3 / 10;
		fourthNumber = placeholder3 % 10;

		placeholder5 = placeholder4 / 10;
		fifthNumber = placeholder4 % 10;

		total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

		// output
		System.out.println("The sum of " + fifthNumber + " + " + fourthNumber + " + " + thirdNumber + " + "
				+ secondNumber + " + " + firstNumber + " is: " + total);
	
	}

}in.close();}}

// had trouble figuring out equation and how to add the sum with / and %
