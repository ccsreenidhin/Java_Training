package ign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loger extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loger frame = new loger();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 99, 210, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 172, 210, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Username");
		txtrUsername.setBounds(57, 69, 96, 22);
		contentPane.add(txtrUsername);
		
		JTextArea txtrPasswword = new JTextArea();
		txtrPasswword.setText("Passwword");
		txtrPasswword.setBounds(57, 142, 96, 22);
		contentPane.add(txtrPasswword);
		
		JTextArea txtrLogin = new JTextArea();
		txtrLogin.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrLogin.setText("Login");
		txtrLogin.setBounds(57, 11, 111, 47);
		contentPane.add(txtrLogin);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(1)
				{
				biller l=new biller();
				l.setVisible(true);
				}
			}
		});
		btnSubmit.setBounds(335, 207, 89, 23);
		contentPane.add(btnSubmit);
	}
}
