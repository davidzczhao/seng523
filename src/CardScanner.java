
public class CardScanner {
	
	public static boolean checkPin(AccountDatabase db, int accNum, int pin) {
		boolean pinValid = false;
		
		for (int i = db.accounts.size(); i > 0; i--)
			if (db.accounts.get(i-1).accountNum == accNum && db.accounts.get(i-1).pin == pin) {
				pinValid = true;
				break;
			}
		
		return pinValid;
	}
	
	public static boolean ejectCard() {
		return true; // Always eject once called. Doesn't really do anything.
	}
}
