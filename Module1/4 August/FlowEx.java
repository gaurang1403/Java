
package August_4;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowEx {
	JFrame F;

	JButton b1, b2, b3, b4;

	public FlowEx() {
		// TODO Auto-generated constructor stub

		F = new JFrame();

		b1 = new JButton("OK");
		b2 = new JButton("Cancel");
		b3 = new JButton("Error");
		b4 = new JButton("Save");

		F.add(b1);
		F.add(b2);
		F.add(b3);
		F.add(b4);

		F.setSize(500, 500);
		F.setLayout(new FlowLayout());
		F.setVisible(true);

	}

	public static void main(String[] args) {
		new FlowEx();
	}

}
