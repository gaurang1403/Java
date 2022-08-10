package August_4;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx {
	JFrame f;
	JTable t;
	String Data[][] ={
			{"101", "Gaurang ", "Pandya"},
			{"102", "Devam", "Bhimani"}	
	};
	String Column[] = {"ID", "FirstName", "LastName"};

	public TableEx() {
		// TODO Auto-generated constructor stub

		f = new JFrame();
		t = new JTable(Data,Column);
		t.setBounds(30,40,200,300);
		JScrollPane pane = new JScrollPane(t);
		
		
		f.add(pane);
		f.setVisible(true);
		f.setSize(500, 500);

	}

	public static void main(String[] args) {
		new TableEx();
	}
}
