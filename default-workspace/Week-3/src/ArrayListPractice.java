import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<String> myAnimals = new ArrayList<String>();

		myAnimals.add("Dog");
		myAnimals.add("Cat");
		myAnimals.add("Hippo");
		myAnimals.add("Bird");
		myAnimals.add("Husky");

		System.out.println(myAnimals);

		ArrayList<Boolean> values = new ArrayList<Boolean>();

		values.add(true);
		values.add(false);
		values.add(false);
		values.add(true);
		values.add(false);

		for (Boolean rain : values) {
			if (rain) {
				System.out.println("Bring an umbrella");
			} else {
				System.out.println("Its a sunny day!");
			}
		}

		// Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14,
		// 5, then:
		// determine whether each of the following values is an element in the list: 23,
		// 77, 15

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(23);
		numList.add(9);
		numList.add(77);
		numList.add(922);
		numList.add(6);
		numList.add(32);
		numList.add(63);
		numList.add(14);
		numList.add(5);

		// if(numList.contains(23)) {
		// System.out.println( "23 is in the list.");
		// }

		for (int i = numList.size() - 1; i >= 0; i--) {
			int number = numList.get(i);
			if (number == 23 || number == 77 || number == 15) {
				System.out.println(number + " is in the list.");
			}
		}
		checkForNumbers(numList);
		// numList.remove(23); //looks at index
		numList.remove((Integer) 23);
		// numList.remove(Integer.valueOf(23));
		// numList.remove(numList.indexOf(23));
		System.out.println(numList);
		checkForNumbers(numList);
	}

	public static void checkForNumbers(ArrayList<Integer> numList) {
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(23);
		newList.add(77);
		newList.add(15);

		for (Integer num : newList) {
			System.out.println(numList.contains(num));
		}
	}

}
