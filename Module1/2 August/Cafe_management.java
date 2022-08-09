package August_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cafe_management {

	JFrame F;
	JLabel l, l2;
	JCheckBox c1, c2, c3;
	JButton b;

	public Cafe_management() {
		// TODO Auto-generated constructor stub

		F = new JFrame("Dira's Cafe");

		l = new JLabel("DIRA'S CAFE");
		l.setBounds(180, 1, 300, 23);

		l2 = new JLabel("MENU");
		l2.setBounds(200, 50, 300, 23);

		c1 = new JCheckBox("pizza @ 100");
		c1.setBounds(180, 100, 300, 23);

		c2 = new JCheckBox("Burger @40");
		c2.setBounds(180, 130, 300, 23);

		c3 = new JCheckBox("Coffe @ 30");
		c3.setBounds(180, 160, 300, 23);

		b = new JButton("Confirm");
		b.setBounds(180, 190, 100, 23);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int amount = 0;

				StringBuilder b = new StringBuilder("\n Selected Items \n");

				if (c1.isSelected()) {
					
					amount += 100;
					b.append("\n pizza @ 100 \n");

				}
				
				if (c2.isSelected()) {
					
					amount += 40;
					b.append("\n Burger @40 \n");
				}
				
				if (c3.isSelected()){
					
					amount += 30;
					b.append("\n Coffe @ 30 \n");
				}
				
				b.append("-------------------------");
				b.append("\n total amount " + amount);
				
				JOptionPane.showMessageDialog(F, b.toString());
		

			}
		});

		F.add(l);
		F.add(l2);
		F.add(c1);
		F.add(c2);
		F.add(c3);
		F.add(b);
		F.setSize(500, 500);
		F.setLayout(null);
		F.setVisible(true);

	}

	public static void main(String[] args) {
		new Cafe_management();
	}
}
