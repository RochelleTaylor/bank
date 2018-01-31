import java.util.Scanner;

public class ForLoopPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ask the user for a number.
		// Display a count from 0 up to the number in your output.

		 System.out.println("Enter a number:");
		 int number = input.nextInt();
		
		 for (int i = 0; i <= number; i++) {
		 System.out.print(i + " ");
		 }
		 System.out.println("\nWe counted to " + number + ".");

		// Ask the user for a name.
		// Display a count of all the letter a’s in the name.
		//
		 System.out.println("Enter a name.");
		 String name = input.nextLine();
		 int count = 0;
		 for (int i = 0; i < name.length(); i++) {
		 if (name.toLowerCase().charAt(i) == 'a') {
		 count ++;
		 }
		 }
		 System.out.println("There are " + count + " a's in "
		 + name + "!");

		// Ask the user for a name and display the name backwards.

		 System.out.println("Enter a name: ");
		 String name2 = input.nextLine();
		
		 for (int i = name2.length() - 1; i >= 0; i--) {
		 System.out.print(name2.charAt(i));
		 }

		// Ask the user for 5 integers. Create a for loop structure
		// that finds the max and min from the data entered

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a integer:");
			temp = input.nextInt();
			if (temp < min) {
				min = temp;
			}
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("The max is " + max + " and the min is " + min + ".");

	}

}