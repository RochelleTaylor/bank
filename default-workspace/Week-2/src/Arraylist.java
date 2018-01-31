import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Raw types (not recommended)
		
		ArrayList<E> numbers = new ArrayList();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add("Four");
		numbers.add(5);
		
		//Enhanced for loop aka for: each loop
		for(object number; numbers) {
			if(number % 2 ==0) {
			System.out.println(numbers);
			}
		}
	
		for(int i=0<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}}
