package August_16;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class Abc extends Canvas
{
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("D://abc.jpg");
		g.drawImage(i,(int )0.5 ,(int)0.1,this);
		
		//super.paint(g);
		
	}
		
	
}

public class ImageEx 
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		Abc a =new Abc();
		
		frame.add(a);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
	}
}
