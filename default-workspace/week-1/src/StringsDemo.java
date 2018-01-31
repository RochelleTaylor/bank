
public class StringsDemo {

	public static void main(String[] args) {
		int numberOfMaids = 7;
		int numberOfMops = 7;

		if(numberOfMaids == numberOfMops) {
		  System.out.println("They might get it clear in half a year.");
		}

		String shoeDescription = "Their shoes were clean and neat";

		if(shoeDescription.equals("Their shoes were clean and neat")) {
		  System.out.println("This is odd, because, you know,");
		  System.out.println("They hadn't any feet.");
		}
		String myGreeting = "Hello";
		System.out.println("Line 19: " + myGreeting.toUpperCase()); // prints "HELLO"
		System.out.println("Line 20: " +myGreeting.toLowerCase()); // prints "hello"
		System.out.println("Line 21:"  +myGreeting); // prints "Hello"
	}


		

		


