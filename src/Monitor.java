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
	private Processor p;

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
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Welcome!\r\n\r\nPlease Insert Your Card");
		textArea.setEditable(false);
		textArea.setBounds(10, 60, 330, 200);
		frame.getContentPane().add(textArea);
		
		JLabel lblAtm = new JLabel("ATM");
		lblAtm.setFont(new Font("Arial", Font.PLAIN, 40));
		lblAtm.setBounds(133, 11, 84, 39);
		frame.getContentPane().add(lblAtm);
		
		JButton btnInsertCard = new JButton("Insert Card");
		btnInsertCard.setBackground(Color.LIGHT_GRAY);
		btnInsertCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Please Enter Your Card Number");
			}
		});
		btnInsertCard.setBounds(54, 271, 110, 25);
		frame.getContentPane().add(btnInsertCard);
		
		JButton btnEjectCard = new JButton("Eject Card");
		btnEjectCard.setBackground(Color.LIGHT_GRAY);
		btnEjectCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Thank you!\r\n\r\nPlease Remove Your Card");
			}
		});
		btnEjectCard.setBounds(174, 271, 110, 25);
		frame.getContentPane().add(btnEjectCard);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("1");
			}
		});
		btnOne.setBounds(350, 101, 39, 23);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("2");
			}
		});
		btnTwo.setBounds(399, 101, 39, 23);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("3");
			}
		});
		btnThree.setBounds(448, 101, 39, 23);
		frame.getContentPane().add(btnThree);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Thank you!\r\n\r\nPlease Remove Your Card");
			}
		});
		btnCancel.setBounds(496, 101, 78, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("4");
			}
		});
		btnFour.setBounds(350, 135, 39, 23);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("5");
			}
		});
		btnFive.setBounds(399, 135, 39, 23);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("6");
			}
		});
		btnSix.setBounds(448, 135, 39, 23);
		frame.getContentPane().add(btnSix);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.clear();
			}
		});
		btnClear.setBounds(496, 135, 78, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("7");
			}
		});
		btnSeven.setBounds(350, 169, 39, 23);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("8");
			}
		});
		btnEight.setBounds(399, 169, 39, 23);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("9");
			}
		});
		btnNine.setBounds(448, 169, 39, 23);
		frame.getContentPane().add(btnNine);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEnter.setBounds(496, 169, 78, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnBlank1 = new JButton("");
		btnBlank1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBlank1.setBounds(350, 203, 39, 23);
		frame.getContentPane().add(btnBlank1);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.keypad.keypress("0");
			}
		});
		btnZero.setBounds(399, 203, 39, 23);
		frame.getContentPane().add(btnZero);
		
		JButton btnBlank2 = new JButton("");
		btnBlank2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBlank2.setBounds(448, 203, 39, 23);
		frame.getContentPane().add(btnBlank2);
		
		JButton btnBlank3 = new JButton("");
		btnBlank3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBlank3.setBounds(496, 203, 78, 23);
		frame.getContentPane().add(btnBlank3);
		
		p = new Processor(frame);
	}
}
