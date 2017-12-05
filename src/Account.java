
public class Account {
	
	public int accountNum;
	public boolean accountStatus;
	public int pin;
	public int id;
	public int balance;
	public int maxWithdraw;
	
	public Account(int accNum, boolean status, int p, int i, int bal, int maxW) {
		accountNum = accNum;
		accountStatus = status;
		pin = p;
		id = i;
		balance = bal;
		maxWithdraw = maxW;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
}
