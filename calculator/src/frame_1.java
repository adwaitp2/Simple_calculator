import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class frame_1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame_1 window = new frame_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		double firstnum;
		double secondnum;
		String operations;
		String answer;
		double result;
	/**
	 * Create the application.
	 */
	public frame_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				
			}
		});
		btnNewButton.setBounds(125, 129, 62, 49);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(125, 67, 280, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("/");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
				
				
			
			}
		});
		button.setFont(new Font("Calibri", Font.BOLD, 16));
		button.setBounds(197, 129, 62, 49);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		button_1.setFont(new Font("Calibri", Font.BOLD, 16));
		button_1.setBounds(271, 129, 62, 49);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		button_2.setFont(new Font("Calibri", Font.BOLD, 16));
		button_2.setBounds(343, 129, 62, 49);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String entervalue = textField.getText() + button_3.getText();
				textField.setText(entervalue);
				
			}
		});
		button_3.setFont(new Font("Calibri", Font.BOLD, 16));
		button_3.setBounds(125, 191, 62, 49);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_4.getText();
				textField.setText(entervalue);
			}
		});
		button_4.setFont(new Font("Calibri", Font.BOLD, 16));
		button_4.setBounds(197, 191, 62, 49);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_5.getText();
				textField.setText(entervalue);
			}
		});
		button_5.setFont(new Font("Calibri", Font.BOLD, 16));
		button_5.setBounds(271, 191, 62, 49);
		frame.getContentPane().add(button_5);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_7.getText();
				textField.setText(entervalue);
			}
		});
		button_7.setFont(new Font("Calibri", Font.BOLD, 16));
		button_7.setBounds(125, 253, 62, 49);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_8.getText();
				textField.setText(entervalue);
			}
		});
		button_8.setFont(new Font("Calibri", Font.BOLD, 16));
		button_8.setBounds(197, 253, 62, 49);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_9.getText();
				textField.setText(entervalue);
			}
		});
		button_9.setFont(new Font("Calibri", Font.BOLD, 16));
		button_9.setBounds(271, 253, 62, 49);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		button_10.setFont(new Font("Calibri", Font.BOLD, 16));
		button_10.setBounds(343, 191, 62, 111);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_11.getText();
				textField.setText(entervalue);
			}
		});
		button_11.setFont(new Font("Calibri", Font.BOLD, 16));
		button_11.setBounds(125, 315, 62, 49);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_12.getText();
				textField.setText(entervalue);
			}
		});
		button_12.setFont(new Font("Calibri", Font.BOLD, 16));
		button_12.setBounds(197, 315, 62, 49);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_13.getText();
				textField.setText(entervalue);
			}
		});
		button_13.setFont(new Font("Calibri", Font.BOLD, 16));
		button_13.setBounds(271, 315, 62, 49);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%f", result);
					textField.setText(answer);
					
					
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%f", result);
					textField.setText(answer);
					
					
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%f", result);
					textField.setText(answer);
					
					
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%f", result);
					textField.setText(answer);
					
					
				}
				
			}
		});
		button_14.setFont(new Font("Calibri", Font.BOLD, 16));
		button_14.setBounds(343, 315, 62, 105);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String entervalue = textField.getText() + button_15.getText();
				textField.setText(entervalue);
			}
		});
		button_15.setFont(new Font("Calibri", Font.BOLD, 16));
		button_15.setBounds(125, 371, 134, 49);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entervalue = textField.getText() + button_16.getText();
				textField.setText(entervalue);
			}
		});
		button_16.setFont(new Font("Calibri", Font.BOLD, 16));
		button_16.setBounds(271, 371, 62, 49);
		frame.getContentPane().add(button_16);
	}
}
