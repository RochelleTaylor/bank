import java.util.Scanner;

public class stringpractice4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a username");
		String userName = input.nextLine();
		
		if(userName.length() >= 8 userName.toLowerCase();
		System.out.println("Try a better username");
		} else {
			System.out.println("Welcome " + userName);
		}
		if(userName.length() >= 8 && userName.toLowerCase().contains("code"))
			System.out.println("We can code it");

	}

}
  