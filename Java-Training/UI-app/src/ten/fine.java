package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class fine extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fine frame = new fine();
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
	public fine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrJackob = new JTextArea();
		txtrJackob.setText("Jackob");
		txtrJackob.setBounds(79, 51, 121, 40);
		contentPane.add(txtrJackob);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("789");
		textArea.setBounds(79, 102, 91, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("235623452");
		textArea_1.setBounds(79, 149, 91, 22);
		contentPane.add(textArea_1);
	}

}
