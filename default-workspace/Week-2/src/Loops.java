import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
		int number = 1;
		
		while( number <= 10) {
			System.out.println(number);
			number ++; // increment by 1
			
			int count = 1;
			while (count < 11) {
				System.out.println("The count is " + count);
				count++; // remember, this increases the value of count by 1
			}
			Scanner input = new Scanner(System.in);
					
			String porridgeTemperature;
			do {
			  System.out.println("Please specify porridge temperature.");
			  System.out.println("Type \"help\" to list options.");
			  porridgeTemperature = input.nextLine();
			  if(porridgeTemperature.equals("help")) {
			    System.out.println("Options: too hot, too cold, just right");
			  }
			} while(porridgeTemperature.equals("help"));
			input.close();
			
			
			
		}

	}

}
