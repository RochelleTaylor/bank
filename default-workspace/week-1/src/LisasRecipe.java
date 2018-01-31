import java.util.Scanner; //Library of resources

public class LisasRecipe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //gives you the ability to use library
		
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		
		System.out.println("Hello " + name + " Enter the cups needed for the recipe ");
		int cupsTotal = input.nextInt();
		System.out.println("Enter the cups used so far");
		int cupsUsed = input.nextInt();
		
		if(cupsUsed > cupsTotal){
			System.out.println("You cannot use more than what was required");
		} else {
		int cupsRemaining = cupsTotal - cupsUsed;
		System.out.println(name + "needs " + cupsRemaining + " cups");
		}
		input.close();

	}

}
