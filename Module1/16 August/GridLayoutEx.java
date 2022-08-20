package August_16;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx {

	JFrame f;
	
	public GridLayoutEx() {
	
		f = new JFrame("Grid Layout");
		
		JButton j1 = new JButton("1");
		JButton j2 = new JButton("2");
		JButton j3 = new JButton("3");
		JButton j4 = new JButton("4");
		JButton j5 = new JButton("5");
		JButton j6 = new JButton("6");
		JButton j7 = new JButton("7");
		JButton j8 = new JButton("8");
		JButton j9 = new JButton("9");
		JButton j10 = new JButton("10");
		JButton j11 = new JButton("11");
		JButton j12 = new JButton("12");
		
		f.add(j1);
		f.add(j2);
		f.add(j3);
		f.add(j4);
		f.add(j5);
		f.add(j6);
		f.add(j7);
		f.add(j8);
		f.add(j9);
		f.add(j10);
		f.add(j11);
		f.add(j12);
		f.setSize(500, 500);
		f.setLayout(new GridLayout(3,3));
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GridLayoutEx();
	}
}
