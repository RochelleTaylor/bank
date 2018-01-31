import java.util.Scanner;

public class selfpractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		 
		System.out.println("Enter your first name");
		String firstName = input.nextLine().trim();
		System.out.println("Enter your last name");
		String lastName = input.nextLine().trim();
		
	if(firstName.length()> lastName.length()) {
		System.out.println(firstName + " is longer");
	if (lastName.length() > firstName.length())
		System.out.println(lastName + " is  longer.");
	} else {
		System.out.println("Both are the same length.");
		
		
	}
		
		

	}

}
