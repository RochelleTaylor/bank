import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Raw types (not recommended)
		ArrayList numbers = new ArrayList();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add("Four");
		numbers.add(5);
		
		//Enhanced for loop aka for:each loop
		for(Object number: numbers) {
			System.out.println(number.getClass());
			if((Integer)number % 2 == 0) {
			System.out.println(number);
			}
		}
		
		
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i)); 
//		}

	}

}