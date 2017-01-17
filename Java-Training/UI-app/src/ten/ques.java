package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ques extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ques frame = new ques();
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
	public ques() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((textField.getText().equals("user"))&&(textField_1.getText().equals("123"))&&(textField_2.getText().equals("456321")))
				{
					fine fin=new fine();
					fin.setVisible(true);
				}
			}
			
		});
		btnSubmit.setBounds(335, 228, 89, 23);
		contentPane.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(121, 90, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentName = new JLabel("student name");
		lblStudentName.setBounds(121, 62, 86, 14);
		contentPane.add(lblStudentName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 143, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 60, 200, 50);
		contentPane.add(textArea);
		
		JTextArea txtrRollNo = new JTextArea();
		txtrRollNo.setText("roll no");
		txtrRollNo.setBounds(118, 121, 89, 23);
		contentPane.add(txtrRollNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 206, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrPhNo = new JTextArea();
		txtrPhNo.setText("ph no");
		txtrPhNo.setBounds(121, 177, 86, 23);
		contentPane.add(txtrPhNo);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.setBounds(118, 11, 89, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(217, 11, 89, 23);
		contentPane.add(btnDelete);
	}
}
