package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleAnArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> Abc = new ArrayList<>();
		
		Abc.add("A");
		Abc.add("B");
		Abc.add("C");
		Abc.add("D");
		Abc.add("E");

		for(String string : Abc) {
			System.out.println(string);
		}
		
		System.out.println("-------------------");
		Collections.shuffle(Abc);
		
		for (int i = 0; i<Abc.size();i++ ) {
			System.out.println(Abc.get(i));
		}
		
	}
}
