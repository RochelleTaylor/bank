package atm;

import java.util.Scanner;

public class AtmApp {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		Atm myAccount = new Atm(100.00);
		String pIN = "1234";
		
		System.out.println("Enter your pin");
		String enteredPin = input.nextLine();
		
		while(!myAccount.allowAccess(enteredPin)) {
			System.out.println("Invalid access. Try again");
			enteredPin = input.nextLine();
	}
		String optionEntered = "";
		do {
		System.out.println("Welcome to Bank of We Can Code It");
		System.out.println("Choose an option ");
		System.out.println("Press 1 to deposit funds.");
		System.out.println("Press 2 to withdraw funds");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to exit");
		String optionEntered = input.nextLine();
		
		while(!optionEntered.equals("4")) {
		if(optionEntered.equals("2")) {
			System.out.println("Enter desired withdraw amount");
			int withdrawAmount = input.nextInt();
			myAccount.withdraw(withdrawAmount);
			System.out.println("You have withdrawn" + withdrawAmount
				+ "and your balance is now" + myAccount.getBalance());
		}
	}else if (optionEntered.equals("4")) {
		System.out.println("Goodbye...");
		System.exit("4");
	}
	}