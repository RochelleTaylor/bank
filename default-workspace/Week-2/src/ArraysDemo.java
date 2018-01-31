
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// System.out.println("Enter the number of cups");
		// int numCups = input.nextInt();

		int[] cupValues = new int[5];

		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;

		// print all values in the array
		for (int i = 0; i < cupValues.length; i++) {
			System.out.println(cupValues[i]);
		}

		System.out.println("Now the array re declared.");
		
		cupValues = new int[2];
		cupValues[0] = 99;
		cupValues[1] = 99;

		// print all values in the array
		for (int i = 0; i < cupValues.length; i++) {
			System.out.println(cupValues[i]);
		}

	}

}
