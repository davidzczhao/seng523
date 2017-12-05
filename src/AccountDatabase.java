import java.util.Vector;

public class AccountDatabase {
	
	public Vector<Account> accounts;
	
	public AccountDatabase() {
		accounts = new Vector<Account>();
		
		// Hardcode accounts
		Account temp = new Account(1234, true, 1111, 1, 1000, 100); // int accNum, boolean status, int p, int i, int bal, int maxW
		accounts.add(temp); // accountNum = 1234, pin = 1111
	}
}
