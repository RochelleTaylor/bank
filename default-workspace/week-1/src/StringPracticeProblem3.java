import java.util.Scanner;

public class StringPracticeProblem3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("create username");
		String wecancodeit = input.nextLine();
		
		System.out.println("verify username");
		String wecandoit = input.nextLine();
		
		
		if(wecancodeit.equals(wecandoit)) {
			System.out.println("matches");
		
		} else {
			System.out.println("no match");
		}
	}
	
		
		
		


	

}
