import java.util.Scanner;

public class StringPracticeProblem2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Create Password");
		String computer = input.nextLine();
		System.out.println("Verify Password");
		String computers = input.nextLine();
		
		if (computer.equals(computers)) {
			System.out.println("matches");
			
		} else {
			System.out.println("no match");
		}
		input.close();
		

	}

}
