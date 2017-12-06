
public class Keypad {
	
	public String buffer; // Stores input from keypad
	
	public Keypad() {
		buffer = "";
	}
	
	public void keypress(String temp) {
		buffer = buffer.concat(temp);
	}
	
	public void clear() {
		buffer = "";
	}
	
	public String enter() {
		return buffer;
	}
}