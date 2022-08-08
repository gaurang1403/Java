
package june_30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc implements ActionListener {

	JFrame F;
	JTextField T1, T2, T3;
	JLabel L1, L2, L3;
	JButton add, minus, division, multiplication;

	Calc() {
		F = new JFrame("My calculator");
		T1 = new JTextField();
		T1.setBounds(197, 11, 100, 20);

		T2 = new JTextField();
		T2.setBounds(197, 51, 100, 20);

		T3 = new JTextField();
		T3.setBounds(197, 91, 100, 20);
		T3.setEditable(false);

		L1 = new JLabel("Enter Number 1");
		L1.setBounds(90, 11, 96, 14);

		L2 = new JLabel("Enter Number 2");
		L2.setBounds(90, 51, 96, 14);

		L3 = new JLabel("Answer");
		L3.setBounds(90, 91, 96, 14);

		add = new JButton("+");
		add.setBounds(197, 136, 46, 38);

		minus = new JButton("-");
		minus.setBounds(257, 136, 46, 38);

		division = new JButton("/");
		division.setBounds(257, 186, 46, 38);

		multiplication = new JButton("*");
		multiplication.setBounds(197, 186, 46, 38);

		add.addActionListener(this);
		minus.addActionListener(this);
		division.addActionListener(this);
		multiplication.addActionListener(this);

		F.add(L1);
		F.add(L2);
		F.add(L3);
		F.add(T1);
		F.add(T2);
		F.add(T3);
		F.add(add);
		F.add(minus);
		F.add(multiplication);
		F.add(division);

		F.setLayout(null);
		F.setVisible(true);
		F.setSize(500, 300);

	}

	public static void main(String[] args) {
		new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String a = T1.getText().toString();
		String b = T2.getText().toString();
		double c = 0;

		if (e.getSource() == add) {
			c = Double.parseDouble(a) + Double.parseDouble(b);
		}
		if (e.getSource() == minus) {
			c = Double.parseDouble(a) - Double.parseDouble(b);
		}
		if (e.getSource() == division) {
			c = Double.parseDouble(a) / Double.parseDouble(b);
		}
		if (e.getSource() == multiplication) {
			c = Double.parseDouble(a) * Double.parseDouble(b);
		}

		T3.setText(String.valueOf(c));
	}
}
