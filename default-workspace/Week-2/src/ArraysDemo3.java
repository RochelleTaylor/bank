
public class ArraysDemo3 {

	public static void main(String[] args) {
		
		//Initializer list
		String[] giantWords = { "fee", "fie", "foe", "fum" };
		
		System.out.println(giantWords.length);
		System.out.println(giantWords[3]);
		
		boolean[] blankArray = new boolean[6];
		
		for	(int i = 0; i < blankArray.length; i++) {
			System.out.println(blankArray[i]);
		}

	}

}
