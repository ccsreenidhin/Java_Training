package color;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class color {

	public static void main(String[] args) {
		JFrame f= new JFrame("color");
		f.setSize(800,300);
		JButton b=new JButton("b");

		f.add(b,BorderLayout.NORTH);
		//b.setVisible(true);
	//	Object windowConstants;
	//	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
	
		
		
		
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t= new JTextField("trext");
				
				f.add(t,BorderLayout.SOUTH);
				t.setSize(200, 200);
				
			}
		
		});
	}
}

		
		

	

