package atm;

public class Account {
	
	private double balance;
	private int pin,cardno;
	
	public Account(double balance, int pin, int cardno) {
		
		this.balance = balance;
		this.pin = pin;
		this.cardno = cardno;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Account() {
		// TODO Auto-generated constructor stub
	}


	public double getBalance() {
		return balance;
	}
	public int getPin() {
		return pin;
	}
	public int getCardno() {
		return cardno;
	}
	
	
	

}
