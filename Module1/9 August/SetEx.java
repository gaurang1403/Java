package August_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Java");
		h.add("Python");
		h.add("JavaScript");
		h.add("php");
		
		Iterator i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
