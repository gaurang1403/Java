package August_2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Confirm implements WindowListener {

	JFrame F;

	public Confirm() {
		// TODO Auto-rated constructor stub
		F = new JFrame();

		F.addWindowListener(this);
		F.setLayout(null);
		F.setVisible(true);
		F.setSize(500, 500);
	}

	public static void main(String[] args) {
		new Confirm();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

		int a = JOptionPane.showConfirmDialog(F, "Are you sure you want to go Garry");

		if (a == JOptionPane.YES_OPTION) {
			F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		if (a == JOptionPane.NO_OPTION) {
			F.setDefaultCloseOperation(JFrame.ABORT);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
