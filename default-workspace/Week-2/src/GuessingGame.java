import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// creates random int between 1 and 10
		// int number = (int)(Math.random() *10 + 1);

		// another way to create random int between 1 and 10
		Random generator = new Random();
		int randNum = generator.nextInt(25) + 1;

		System.out.println(randNum);
		System.out.println("Please pick a number between 1 -25:");
		int guess = input.nextInt();

		int difference = 0;
		while (guess != randNum) {
			difference = Math.abs(randNum - guess);
			System.out.println("Try Again! You're off by " + difference);
			guess = input.nextInt();
		}
		System.out.println("Good Guess!");

	}

}
