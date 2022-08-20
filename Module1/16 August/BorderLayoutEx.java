package August_16;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx implements ActionListener {

	
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	
	public BorderLayoutEx() {
		// TODO Auto-generated constructor stub
	
		f = new JFrame();
		b1 = new JButton("North");
		b2 = new JButton("South");
		b3 = new JButton("East");
		b4 = new JButton("West");
		b5 = new JButton("Center");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(500, 500);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			System.out.println("Welcome to North Direction");
		}
		if(e.getSource() == b2) {
			System.out.println("Welcome to South Direction");
		}
		if(e.getSource() == b3) {
			System.out.println("Welcome to East Direction");
		}
		if(e.getSource() == b4) {
			System.out.println("Welcome to West Direction");
		}
		if(e.getSource() == b5) {
			System.out.println("Welcome to Center");
		}
		
	}
}
