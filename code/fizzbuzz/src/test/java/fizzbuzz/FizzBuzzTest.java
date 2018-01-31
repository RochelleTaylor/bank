package fizzbuzz;

import org.junit.Test;

import org.junit.Assert;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();

		// act
		String response = underTest.say(1);

		// assert
		Assert.assertEquals("1", response);

	}

	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(2);

		Assert.assertEquals("2", response);

	}

	@Test
	public void shouldSayFizzForThree() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(3);

		Assert.assertEquals("Fizz", response);

	}
	@Test
	public void shouldSayFizzForFive() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(5);

		Assert.assertEquals("buzz", response);

	}
	@Test
	public void shouldSayFizzForSix() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(6);

		Assert.assertEquals("Fizz", response);

	}
	@Test
	public void shouldSayFizzBuzzForFifteen() {
		FizzBuzz underTest = new FizzBuzz();

		String response = underTest.say(15);

		Assert.assertEquals("FizzBuzz", response);
}
}