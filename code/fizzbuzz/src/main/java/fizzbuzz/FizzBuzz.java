package fizzbuzz;

public class FizzBuzz {
	public String say (int number) {
		if(number % 3 == 0 && number % 5 == 0) {
		return "FizzBuzz";
		}
		if(number % 3 == 0) {
			return "Fizz";
		}
		
		
		if(number % 5 == 0) {
			return "buzz";
		}
		return "" + number;
		
	}
	private boolean isFizz(int n) {
		return n % 3 == 0;
	}

	private boolean isBuzz(int n) {
	return n % 5 == 0;
	}
	}
	
 