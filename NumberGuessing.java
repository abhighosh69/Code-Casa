// Java program for the above approach
import java.util.*;

public class NumberGuessing {

	// Implements a function that will guessing number
	public static void numberGuess()
	{
		// Createing a Scanner Class Object
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int random_number = 1 + (int)(100* Math.random());
		System.out.println(random_number);

		// Given trials
		int maxTries = 10;
		int tries=0, guess;
		int points= maxTries;
		System.out.println("A number is chosen between 1 to 100. Guess the number within "+maxTries+" trials.");

		// Iterate over maxTries Trials
		while(tries < maxTries) 
		{
			System.out.println("Guess the number:");
			// Take input for guessing
			guess = sc.nextInt();
			tries++;
			// If the number is guessed
			if (guess==random_number) {
				System.out.println("Congratulations! You guessed the number.");
				System.out.println("Points earned: " + points);
				break;
			}
			else if (random_number < guess) {
				System.out.println("The number is less than " + guess);
			}
			else if (random_number > guess) {
				System.out.println("The number is greater than " + guess);
			}
			points--;  // Reduce points for each attempt
		}
		// Trial end
		if(tries == maxTries) {
			System.out.println("You have exhausted "+maxTries+ " trials.");
			System.out.println("The number was " + random_number);
		}
	}

	// Driver Code
	public static void main(String arg[])
	{
		// Function Call
		numberGuess();
	}
}
