package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> Coding = new ArrayList<>();
		
		Coding.add("Java");
		Coding.add("JavaScript");
		Coding.add("Python");
		Coding.add("Android");
		Coding.add("IOS");
		
		
		for (String string : Coding) {
			System.out.println(string);
		}
		
		
//		for(int i = 0; i<Coding.size();i++) {
//			System.out.println(Coding.get(i));
//		}
	}
}
