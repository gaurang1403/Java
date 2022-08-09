package August_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Checkbox implements ItemListener, ActionListener {

	JFrame F;
	JCheckBox cb1, cb2;
	JLabel l;
	JButton b;

	public Checkbox() {
		// TODO Auto-generated constructor stub
		F = new JFrame();

		b = new JButton("SUBMIT");
		b.setBounds(200, 200, 100, 23);

		l = new JLabel("Which Technology are you working on");
		l.setBounds(125, 125, 300, 23);

		cb1 = new JCheckBox("Java");
		cb1.setBounds(200, 150, 100, 23);

		cb2 = new JCheckBox("Android");
		cb2.setBounds(200, 175, 100, 23);

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		b.addActionListener(this);

		F.add(b);
		F.add(l);
		F.add(cb1);
		F.add(cb2);
		F.setLayout(null);
		F.setVisible(true);
		F.setSize(500, 500);

	}

	public static void main(String[] args) {
		new Checkbox();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == cb1) {
//			JOptionPane.showMessageDialog(F, "You are learning Java");
			System.out.println("You are learning java");
		}
		if (e.getSource() == cb2) {
//			JOptionPane.showMessageDialog(F, "You are learning Android");
			System.out.println("You are learning Android");
		}
		if (e.getSource() == b) {
			System.out.println("You are learning java and android");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {
			System.out.println("You are learning java and android");
		}
	}
}
