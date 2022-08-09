package August_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combobox implements ActionListener {

	JFrame F;
	JComboBox<String> cb;
	String City[] = { "Rajkot", "Gandhinagar", "Vadodara", "Ahmedabad" };

	public Combobox() {
		// TODO Auto-generated constructor stub
		F = new JFrame();
		
		cb = new JComboBox<>(City);
		cb.setBounds(210, 11, 100, 20);
		cb.addActionListener(this);
		
		F.add(cb);
		F.setSize(500, 500);
		F.setLayout(null);
		F.setVisible(true);

	}

	public static void main(String[] args) {
		new Combobox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == cb) {
				System.out.println(cb.getItemAt(cb.getSelectedIndex()));
		}
	}
}
