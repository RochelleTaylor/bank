import java.util.Scanner;

public class itNeverStopsLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	int userMaxInput = 0;
	int userMinInput = 0;
	do {	
		System.out.println("Please enter min interger");
		int userMinInput1 = input.nextInt();
		System.out.println("Please enter max interger");
		int userMaxInput1 = input.nextInt();
	}while (userMaxInput < userMinInput);

	
	int sumUserInput = 0;
	while(userMaxInput >= userMinInput) {
		sumUserInput+= userMaxInput;
		userMaxInput-= 1;
	}
	System.out.println(sumUserInput);
	}
		}
			


