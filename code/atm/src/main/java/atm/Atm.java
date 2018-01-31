package atm;

public class Atm {
	
	private double balance; 
	//private String requiredPin= "1234";
	
	public double getBalance() {
		return balance;
	}
	public Atm() {
		//could have done;
		//balance = 500.00;
		//calling the other constructor
		this(500.00);
	}
	public Atm(double amount) {
		balance= amount;
	}
	public void withdraw(int amountToWithDraw){
		// balance = balance = amountToWithdraw; 
		balance -= amountToWithDraw;
		
	}
	
	Public boolean allowAccess(String enteredPin) {
		return enteredPin;
	}
	public boolean allowAccess1(String enteredPin) {
		// TODO Auto-generated method stub
		return false;
	}
}