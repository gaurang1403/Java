package August_2;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton implements ItemListener {

	JFrame F;
	JRadioButton r1, r2;
	JLabel l;

	public RadioButton() {
//		 TODO Auto-generated constructor stub
		F = new JFrame();

		r1 = new JRadioButton("Male");
		r1.setBounds(176, 100, 97, 23);

		r2 = new JRadioButton("Female");
		r2.setBounds(176, 120, 97, 23);

		r1.addItemListener(this);
		r2.addItemListener(this);

		l = new JLabel("Your Gender");
		l.setBounds(170, 70, 97, 23);
		
		F.add(r1);
		F.add(r2);
		F.add(l);
		F.setSize(500, 500);
		F.setLayout(null);
		F.setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButton();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== r1) {
			System.out.println("You are Male");
		}
		if(e.getSource()== r2) {
			System.out.println("You are Female");
		}

	}
}
