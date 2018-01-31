
public class username {

	public static void main(String[] args) {
String userName;
        
        while (true) {
            System.out.println("Please enter a username.  It must have at least 8 characters and contain the word \"code\".");
            userName = input.nextLine();
            System.out.println();

            if (userName.length() < :sunglasses: {
                System.out.println("That username is too short.  Please try again.");
            } else if (!userName.toLowerCase().contains("code")) {
                System.out.println("That username does not contain \"code\". Please try again.");
            } else {
                break;
            }
        }
        System.out.println("Hi, " + userName + ".");

	}

}
