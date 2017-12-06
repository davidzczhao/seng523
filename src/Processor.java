import javax.swing.JFrame;

public class Processor {

	public AccountDatabase db;
	public Keypad keypad;
	public CashDisburser cDisburser;
	public CashBank cBank;
	
	private JFrame f;
	
	public Processor(JFrame frame) {
		db = new AccountDatabase();
		keypad = new Keypad();
		cDisburser = new CashDisburser();
		cBank = new CashBank();
		
		f = frame; // Handle to the frame
	}
	
	// Not using this simply because of time constraint. Decided to brute force in the GUI class instead.
}
