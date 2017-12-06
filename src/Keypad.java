
public class Keypad {
	
	public String buffer; // Stores input from keypad
	
	public Keypad() {
		
	}
	
	public void keypress(String temp) {
		buffer.concat(temp);
	}
	
	public void clear() {
		buffer = "";
	}
	
	public String enter() {
		return buffer;
	}
}