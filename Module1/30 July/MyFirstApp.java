package july_30;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstApp {

	JFrame F;
	JButton B;
	public MyFirstApp() {
		// TODO Auto-generated constructor stub
		F = new JFrame("My First App");
		B = new JButton("Click me");
		
		B.setBounds(200, 300, 100, 25);
	
		F.add(B);
		F.setLayout(null);
		F.setVisible(true);
		F.setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new MyFirstApp();
	}
}
