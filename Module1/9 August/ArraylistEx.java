package August_9;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Java");
		arraylist.add("Android");
		arraylist.add("IOs");

		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Python");
		arraylist2.add("JavaScript");
		arraylist2.add("php");
		
		arraylist.retainAll(arraylist2);
		
		System.out.println(arraylist);

	}
}
