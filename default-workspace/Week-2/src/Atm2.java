
import java.util.Scanner;

public class Atm2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String pin = "1234";
		int attempts = 0;

		System.out.println("Enter your pin");
		String pinEntered = input.nextLine();
		attempts++;

		while (!pinEntered.equals(pin) ) {
			System.out.println("Invalid pin.");
			System.out.println("Re-enter your pin");
			pinEntered = input.nextLine();
			attempts++;

			if (attempts == 3) {
				System.out.println("Toom many attempts..bye");
				System.exit(0);
			}
		}
		System.out.println("Continue on with application.");

	}

}
