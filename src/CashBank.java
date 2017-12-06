
public class CashBank {
	public int balance;
	
	public CashBank() {
		balance = 1000; // Initial funds
	}
	
	public void disburse(int amount) {
		balance -= amount;
	}
}
