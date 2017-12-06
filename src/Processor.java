import javax.swing.JFrame;

public class Processor {

	public AccountDatabase db;
	public CardScanner scanner;
	public Keypad keypad;
	public CashDisburser cDisburser;
	public CashBank cBank;
	
	private JFrame f;
	
	public Processor(JFrame frame) {
		db = new AccountDatabase();
		scanner = new CardScanner();
		keypad = new Keypad();
		cDisburser = new CashDisburser();
		cBank = new CashBank();
		
		f = frame; // Handle to the frame
	}
	
	// Decide on how processor will work
}
