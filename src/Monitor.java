import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Monitor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monitor window = new Monitor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Monitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setText("Welcome!\r\n\r\nPlease Insert Your Card");
		txtrWelcome.setEditable(false);
		txtrWelcome.setBounds(10, 61, 330, 200);
		frame.getContentPane().add(txtrWelcome);
		
		JLabel lblAtm = new JLabel("ATM");
		lblAtm.setFont(new Font("Arial", Font.PLAIN, 40));
		lblAtm.setBounds(133, 11, 84, 39);
		frame.getContentPane().add(lblAtm);
		
		JButton btnInsertCard = new JButton("Insert Card");
		btnInsertCard.setBackground(Color.LIGHT_GRAY);
		btnInsertCard.setBounds(80, 272, 89, 23);
		frame.getContentPane().add(btnInsertCard);
		
		JButton btnEjectCard = new JButton("Eject Card");
		btnEjectCard.setBackground(Color.LIGHT_GRAY);
		btnEjectCard.setBounds(179, 272, 89, 23);
		frame.getContentPane().add(btnEjectCard);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOne.setBounds(350, 101, 39, 23);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(399, 101, 39, 23);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setBounds(448, 101, 39, 23);
		frame.getContentPane().add(btnThree);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(496, 101, 78, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnFour = new JButton("4");
		btnFour.setBounds(350, 135, 39, 23);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setBounds(399, 135, 39, 23);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setBounds(448, 135, 39, 23);
		frame.getContentPane().add(btnSix);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(496, 135, 78, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(350, 169, 39, 23);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setBounds(399, 169, 39, 23);
		frame.getContentPane().add(btnEight);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(448, 169, 39, 23);
		frame.getContentPane().add(button_9);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBounds(496, 169, 78, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnBlank1 = new JButton("");
		btnBlank1.setBounds(350, 203, 39, 23);
		frame.getContentPane().add(btnBlank1);
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(399, 203, 39, 23);
		frame.getContentPane().add(btnZero);
		
		JButton btnBlank2 = new JButton("");
		btnBlank2.setBounds(448, 203, 39, 23);
		frame.getContentPane().add(btnBlank2);
		
		JButton btnBlank3 = new JButton("");
		btnBlank3.setBounds(496, 203, 78, 23);
		frame.getContentPane().add(btnBlank3);
	}
}
