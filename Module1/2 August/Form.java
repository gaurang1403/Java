
package August_2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;import javax.swing.border.EmptyBorder;

public class Form {

	JFrame F;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JPasswordField p1,p2;
	JTextField t1, t2, t3;
	JRadioButton r1, r2;
	JComboBox<String> c1, c2, c3;
	JButton b;
	
	String course[] = { "B.E./B.Tech", "M.E./M.Tech", "BSc", "MSc" };
	String Branch[] = { "Computer Science", "Information Technology", "Mechanical", "Civil" };
	String semester[] = { "1", "2", "3", "4", "5", "6", "7", "8" };

	Form() {
		F = new JFrame("Student Management");

		l1 = new JLabel("Register a new Student");
		l1.setBounds(180, 10, 200, 40);

		l2 = new JLabel("Name");
		l2.setBounds(80, 50, 50, 20);
		t1 = new JTextField();
		t1.setBounds(180, 50, 150, 20);

		l3 = new JLabel("DOB");
		l3.setBounds(80, 90, 50, 20);

		l4 = new JLabel("Gender");
		l4.setBounds(80, 130, 50, 20);
		r1 = new JRadioButton("Male");
		r1.setBounds(180, 130, 70, 20);
		r2 = new JRadioButton("Female");
		r2.setBounds(250, 130, 150, 20);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		l5 = new JLabel("Mail id");
		l5.setBounds(80, 170, 50, 20);
		t2 = new JTextField();
		t2.setBounds(180, 170, 150, 20);

		l6 = new JLabel("Mobile No.");
		l6.setBounds(80, 210, 70, 20);
		t3 = new JTextField();
		t3.setBounds(180, 210, 150, 20);

		l7 = new JLabel("Password");
		l7.setBounds(80, 250, 70, 20);
		p1 = new JPasswordField();
		p1.setBounds(180, 250, 150, 20);

		l8 = new JLabel("Re Password");
		l8.setBounds(80, 290, 90, 20);
		p2 = new JPasswordField();
		p2.setBounds(180, 290, 150, 20);

		l9 = new JLabel("Courses");
		l9.setBounds(80, 330, 70, 20);
		c1 = new JComboBox<>(course);
		c1.setBounds(180, 330, 150, 20);

		l10 = new JLabel("Branch");
		l10.setBounds(80, 370, 70, 20);
		c2 = new JComboBox<>(Branch);
		c2.setBounds(180, 370, 150, 20);

		l11 = new JLabel("Semester");
		l11.setBounds(80, 410, 70, 20);
		c3 = new JComboBox<>(semester);
		c3.setBounds(180, 410, 150, 20);

		l12 = new JLabel("yyyy-mm-dd");
		
		
		b =new JButton("Submit");
		b.setBounds(180, 450, 150, 40);

		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				
				
				
				try 
				{
					String dname="Your name is";
					String demail="\n Your Email is";
					String name=t1.getText().toString();
					String mail=t2.getText().toString();
					FileOutputStream fout =new FileOutputStream("D://tops.txt");
					fout.write(dname.getBytes());
					fout.write(name.getBytes());
					fout.write(demail.getBytes());
					fout.write(mail.getBytes());
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("Success");
			}
		});
		
		
		
		F.add(l1);
		F.add(l2);
		F.add(t1);
		F.add(l3);
		F.add(l4);
		F.add(r1);
		F.add(r2);
		F.add(l5);
		F.add(t2);
		F.add(l6);
		F.add(t3);
		F.add(l7);
		F.add(p1);
		F.add(l8);
		F.add(p2);
		F.add(l9);
		F.add(c1);
		F.add(l10);
		F.add(c2);
		F.add(l11);
		F.add(c3);
		F.add(b);

		F.setSize(500, 700);
		F.setLayout(null);
		F.setVisible(true);

	}

	public static void main(String[] args) {
		new Form();
	}
}
