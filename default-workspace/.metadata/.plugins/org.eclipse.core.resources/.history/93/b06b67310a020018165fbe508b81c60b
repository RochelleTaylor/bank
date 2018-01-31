package atm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalance() {
		// Arrange
		Atm underTest = new Atm();

		// act
		double balance = underTest.getBalance();

		// assert
		Assert.assertEquals(500.00, balance, 0.001);

	}

	@Test
	public void shouldHaveStartingBalance() {
		//arrange
		Atm underTest = new Atm(2700.00);
		underTest.withdraw(50);
		//act
		double balance = underTest.getBalance();
		//assert
		Assert.assertEquals(2700.00, balance, 0.001);

	}
	@Test
	public void shouldWithdraw50() {
		Atm underTest = new Atm();
		underTest.withdraw(50);
		double balance = underTest.getBalance();
		Assert.assertEquals(2700.00,balance, 0.001);
	}
	
	@Test
	public void shouldAllowAcessByPin() {
		Atm underTest = new Atm();
		boolean check = underTest.allowAccess("1234");
		Assert.assertEquals(true, check);
}
	
	@Test
	public void shouldDenyAccessByPin() {
		Atm underTest = new Atm();
		boolean check = underTest.allowAccess("1234");
		//Assert.assertEquals(false, check);
		Assert.assertFalse(check);
	}
}