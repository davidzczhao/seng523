
public class Processor {

	public AccountDatabase db;
	public CardScanner scanner;
	public Keypad keypad;
	public CashDisburser cDisburser;
	public CashBank cBank;
	
	public Processor() {
		db = new AccountDatabase();
		scanner = new CardScanner();
		keypad = new Keypad();
		cDisburser = new CashDisburser();
		cBank = new CashBank();
		
		runThrough();
	}
	
	// Designed for a single run.
	public void runThrough() {
		// Welcome message already being displayed, begin with card insertion
		
		// Check pin
		
		// Check amount
		
		// Verify account balance
		
		// Verify cash availability
		
		// Disburse cash
		
		// Eject card
	}
}
