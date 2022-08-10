package August_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Menu implements ActionListener, WindowListener {
	JFrame F;
	JMenuBar menubar;
	JMenu File, Edit, Save;
	JTextArea t;
	JMenuItem i1, i2, i3, i4, i5, i6;

	public Menu() {
		// TODO Auto-generated constructor stub
		F = new JFrame("Gaurng's Noteped");
		menubar = new JMenuBar();
		t = new JTextArea();
		t.setBounds(1, 1, 500, 500);

		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Save = new JMenu("Save");

		i1 = new JMenuItem("Copy");
		i2 = new JMenuItem("Cut");
		i3 = new JMenuItem("Paste");
		i4 = new JMenuItem("Select All");
		i5 = new JMenuItem("New");
		i6 = new JMenuItem("Open");

		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);

		File.add(i5);
		File.add(i6);
		Edit.add(i1);
		Edit.add(i2);
		Edit.add(i3);
		Edit.add(i4);
		menubar.add(File);
		menubar.add(Save);
		menubar.add(Edit);
		F.addWindowListener(this);
		F.add(t);
		F.setJMenuBar(menubar);
		F.setSize(500, 500);
		F.setLayout(null);
		F.setVisible(true);
	}

	public static void main(String[] args) {
		new Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == i1) {
			t.copy();
		}

		if (e.getSource() == i2) {
			t.cut();
		}

		if (e.getSource() == i3) {
			t.paste();
		}

		if (e.getSource() == i4) {
			t.selectAll();
		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

		int a = JOptionPane.showConfirmDialog(F, "Do you want to save chages ");

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
