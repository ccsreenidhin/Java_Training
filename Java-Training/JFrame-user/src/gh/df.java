package gh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class df extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPhoneNumber;
	private JTextField txtRollNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					df frame = new df();
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
	public df() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginDetails = new JLabel("Login Details");
		lblLoginDetails.setBounds(52, 59, 77, 20);
		contentPane.add(lblLoginDetails);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(52, 105, 77, 20);
		contentPane.add(lblUserName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(52, 156, 99, 20);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setBounds(52, 205, 99, 14);
		contentPane.add(lblRollNumber);
		
		txtUsername = new JTextField();
		txtUsername.setText("username");
		txtUsername.setBounds(173, 105, 128, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("phone number");
		txtPhoneNumber.setBounds(173, 156, 128, 20);
		contentPane.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtRollNumber = new JTextField();
		txtRollNumber.setText("roll number");
		txtRollNumber.setBounds(173, 202, 128, 20);
		contentPane.add(txtRollNumber);
		txtRollNumber.setColumns(10);
		SS q=new SS();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnSubmit.setBounds(335, 201, 89, 23);
		contentPane.add(btnSubmit);
	}
}
