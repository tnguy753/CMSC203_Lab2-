import java.util.Scanner;

/**
This program demonstrates how numeric types and operators behave in Java
*/
public class NumericType {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here
		Scanner Input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 ; // first test score
		int score2 ; // second test score
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the users temperature
		double tempF;
		//Task #2 prompt user to input score1
		System.out.print("Please enter the first score: ");
		score1 = Input.nextInt();
		//Task #2 read score1 
		System.out.println("The first score is: " + score1);
		//Task #2 prompt user to input score2
		System.out.print("Please enter the second score: ");
		score2 = Input.nextInt();
		//Task #2 read score2 
		System.out.println("The second score is: " + score2);
		// Find an arithmetic average
		average = (score1*1.0 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		System.out.println(" \nConvert Fahrenheit temperatures to Celsius");
		//Task #2 prompt user to input another temperature
		System.out.print("Please enter the temperature in Fahrenheit:");
		tempF = Input.nextDouble();
		//Task #2 read the users temperature in Fahrenheit
		System.out.println("The temperature in Fahrenheit you entered is: " + tempF);
		//Task #2 convert the users temperature to Celsius
		double tempC = (tempF - 32)*5/9;
	    //Task #2 print the users temperature in Celsius
		output= tempF + " in Fahrenheit is " + tempC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
		Input.close();
	}
}
