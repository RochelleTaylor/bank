
public class StringPractice {

	public static void main(String[] args) {
		
		String name = "  Donny  ";
		System.out.println(name.length());
		
		System.out.println(name.trim().length());
		System.out.println(name.trim());
		
		
		name= "Donny";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.substring(0,2));
		
		System.out.println(name.contains("do"));
	}
	

}
