package july_28;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseriaslization 
{
	public static void main(String[] args) {
		
		try 
		{
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://abhi.txt"))) {
				Student s=(Student) in.readObject();
				
				System.out.println(s.id+" "+s.name);
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
