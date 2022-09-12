package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class JoinTwoArraylist {

	public static void main(String[] args) {

		ArrayList<String> abc = new ArrayList<>();
		ArrayList<String> def = new ArrayList<>();
		ArrayList<String> ghi = new ArrayList<>();

		abc.add("A");
		abc.add("B");
		abc.add("C");
		abc.add("D");
		abc.add("E");

		def.add("E");
		def.add("F");
		def.add("G");
		def.add("H");
		def.add("I");

		ghi.addAll(abc);
		ghi.addAll(def);
		
		System.out.println(abc);
		System.out.println("------------------------------------");
		System.out.println(def);
		System.out.println("------------------------------------");

		for(int i = 0; i<ghi.size();i++) {
			System.out.println(ghi.get(i));
		}

	}
}
