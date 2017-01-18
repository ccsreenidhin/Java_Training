package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import student.stdv;

public class std extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea txtrName;
	private JTextArea txtrRollNo;
	private JTextArea txtrPhNo;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					std frame = new std();
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
	public std() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(77, 79, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 144, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 204, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setBounds(77, 46, 86, 22);
		contentPane.add(txtrName);
		
		txtrRollNo = new JTextArea();
		txtrRollNo.setText("Roll no");
		txtrRollNo.setBounds(77, 110, 86, 27);
		contentPane.add(txtrRollNo);
		
		txtrPhNo = new JTextArea();
		txtrPhNo.setText("Ph no");
		txtrPhNo.setBounds(77, 171, 86, 22);
		contentPane.add(txtrPhNo);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((textField.getText().equals("user"))&&(textField_1.getText().equals("123"))&&(textField_2.getText().equals("456321")))
				{
					stdv fin=new stdv();
					fin.setVisible(true);
				}
			}
		});
		btnSubmit.setBounds(314, 203, 89, 23);
		contentPane.add(btnSubmit);
	}

}
