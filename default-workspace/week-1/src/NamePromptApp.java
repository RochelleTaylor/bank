
import java.util.Scanner;

public class NamePromptApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Hello, " + name);

		input.close();

		Scanner input1 = new Scanner(System.in);

		System.out.println("Enter street address:");
		int houseNumber = input1.nextInt();
		String street = input1.nextLine();

		System.out.println("house number is " + houseNumber);
		System.out.println("street is " + street);
	}

		
		
		//ask user for a length and width
		//calculate the area of the rectangle
		
		Scanner input = new Scanner(System.in);{
		System.out.print("Enter the length:");
		double length = input.nextDouble();
		System.out.print("Enter the width:");
		double width = input.nextDouble();
		
		
	}
}
