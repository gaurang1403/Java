package August_4;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class Icon {

	Frame f;

	public Icon() {

		// TODO Auto-generated constructor stub

		f = new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\spider_man.jpg");
		
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new Icon();
	}

}
