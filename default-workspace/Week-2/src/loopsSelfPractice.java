import java.util.Scanner;

public class loopsSelfPractice {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Message");
		String message = input.nextLine();
		
		int count = 1;
		while(count <= 6) {
		System.out.println(count);
		
		do {
			System.out.println(message);
			count ++;
		}while (count <= 6);
		
		}
	}
}

		
