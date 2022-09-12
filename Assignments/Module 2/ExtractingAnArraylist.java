package Module_2;

import java.util.ArrayList;
import java.util.List;

public class ExtractingAnArraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> pqr = new ArrayList<>();
		pqr.add("A");
		pqr.add("B");
		pqr.add("C");
		pqr.add("D");
		pqr.add("E");
		
		System.out.println(pqr);
		
		List<String> xyz = pqr.subList(0, 5);
		
		System.out.println(xyz);
		
	}

}
