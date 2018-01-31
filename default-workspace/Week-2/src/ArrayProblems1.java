
public class ArrayProblems1 {

	public static void main(String[] args) {

		// The names of three people you know
		String[] names = { "Pack", "Roden", "Saxon" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// The GPAs on a 4.0 scale of five students

		double[] gpa = new double[5];

		gpa[0] = 2.5;
		gpa[1] = 3.0;
		gpa[2] = 3.5;
		gpa[3] = 3.7;
		gpa[4] = 4.0;

		for (int i = 0; i < gpa.length; i++) {
			System.out.println(gpa[i]);
		}

		String[] vacationSpots = { "Jamaica", "Banff Nat Park", "Outer Banks", "Kona" };
		System.out.println(vacationSpots[0]);
		System.out.println(vacationSpots[vacationSpots.length - 1]);

		String name = "Carson";
		char[] letters = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			letters[i] = name.charAt(i);
			System.out.println(letters[i]);
			System.out.println(i + " letter in the name.");
		}
		
	}
}

