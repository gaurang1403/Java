package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArraylist {
	public static void main(String[] args) {
		
		ArrayList<String> def = new ArrayList<>();
		
		def.add("A");
		def.add("B");
		def.add("C");
		def.add("D");
		def.add("E");
		
		System.out.println(def);
		
		System.out.println("-------------------------------");
		
		Collections.reverse(def);
		
		System.out.println(def);
	}

}
