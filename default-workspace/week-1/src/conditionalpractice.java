
public class conditionalpractice {

	public static void main(String[] args) {
		
		int age = 42;
		if (age >= 16) {
		  System.out.println("You are " + age + ", so you are legal to drive.");
		  System.out.println("Be safe");
		}
		
		int hoursOfSleep = 42;
		if (hoursOfSleep >= 8) {
		  System.out.println("You are likely to feel more rested.");
		}
		
		if (hoursOfSleep == 42) {
			  System.out.println("He used 42 again, didn't he?");
			 }
		
		int heightInInches = 73;

		if(heightInInches >= 60) {
		  System.out.println("You are tall enough to ride");
		}
		if(heightInInches >= 60) {
			  System.out.println("You are tall enough to ride.");
			} else if(heightInInches >= 30) {
			  System.out.println("Try the teacups. They look fun.");
			} else {
			  System.out.println("I'm sorry, too short.");
			}
		
		String ageGroup = "baby";

		switch (ageGroup) {
		case "adult":
			System.out.println("You can ride the rollercoaster!");
			break;
		case "youngster":
			System.out.println("The teacups are fun.");
			break;
		default:
			System.out.println("Oh, you must be a toddler. Toddle on!");
		}
	}
	
}

	
	
