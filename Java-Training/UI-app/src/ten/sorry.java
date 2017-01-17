package ten;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sorry extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			sorry dialog = new sorry();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public sorry() {
		setResizable(false);
		setBounds(100, 100, 359, 181);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 353, 42);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 120, 353, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			JTextArea txtrWrongUsernameOr = new JTextArea();
			txtrWrongUsernameOr.setBounds(35, 61, 236, 22);
			getContentPane().add(txtrWrongUsernameOr);
			txtrWrongUsernameOr.setText("Wrong username or password!!!");
		}
	}

}
