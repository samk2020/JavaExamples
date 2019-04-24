//public class AvtestScore solution cs 3340
import java.util.Scanner;

public class AvtestScore{

	public static void main(String args[])
	{
		// Create a Scanner object attached to stdin
		Scanner input = new Scanner(System.in);
		
		double score1, score2, score3, average;
		
		// Get input
		System.out.print("Enter score 1: ");
		score1 = input.nextDouble();
		
		System.out.print("Enter score 2: ");
		score2 = input.nextDouble();
		
		System.out.print("Enter score 3: ");
		score3 = input.nextDouble();
		
		// Process it 
		average = (score1 + score2 + score3) / 3;
		
		// Provide output
		System.out.println("Score 1 is " + score1 + ".");
		System.out.println("Score 2 is " + score2 + ".");
		System.out.println("Score 3 is " + score3 + ".");
		System.out.println("The average score is " + average + ".");
	}
}


