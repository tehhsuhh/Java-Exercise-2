//Tessa Biava
//June 9th, 2019
//CST-105
//This is my own work
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt user for F input
		System.out.print("Enter a Fahrenheit temperature: ");
		double inputF = input.nextDouble();   //reads number from user and assigns
		
			//.print prints everything on the same line
		
		// calculate F to C
		double Celsius = (inputF - 32) * 5 / 9;
		System.out.println(inputF + "F is equivalent to " + Celsius + "C");
		
			//.println prints things on the next line (layout pleasing)
		
		// prompt user for C input
		System.out.print("Enter a Celsius temperature: ");
		double inputC = input.nextDouble();

		// calculate C to F
		double Fahren = (inputC * (9.0 / 5.0)) + 32;
		System.out.println(inputC + "C is equivalent to " + Fahren + "F");
			// the calculations were tricky, parenthesis were KEY!!
	}

}

// had hard time figuring out how to put each output on different lines
// had to switch between println and print
// still wondering how to close the import java.util.scanner 
// choosing names is hard
