package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import student.pagdet;
import student.sorry;

public class Log extends JFrame {

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
					Log frame = new Log();
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
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
				
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("admin")&&(textField_1.getText().equals("pass")))
				{
				pagdet det=new pagdet();
				det.setVisible(true);
				dispose();
				}
				else if(textField.getText().equals("tar")&&(textField_1.getText().equals("tar")))
				{
				
				}
				else
				{
					sorry sor=new sorry();
					sor.setVisible(true);
				}
								
			}}
		);
		btnSubmit.setBounds(335, 228, 89, 23);
		contentPane.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(67, 87, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(67, 166, 110, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Username");
		txtrUsername.setBounds(67, 65, 86, 22);
		contentPane.add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setBounds(67, 140, 86, 22);
		contentPane.add(txtrPassword);
		
		JTextArea txtrLogin = new JTextArea();
		txtrLogin.setFont(new Font("Monospaced", Font.PLAIN, 30));
		txtrLogin.setText("Login");
		txtrLogin.setBounds(70, 11, 94, 43);
		contentPane.add(txtrLogin);
	}

}
