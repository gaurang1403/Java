package August_13;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet<>();
		
		l.add("Gaurang");
		l.add("Pandya");
		l.add("21");
		
		System.out.println(l);
		
		TreeSet t = new TreeSet<>();
		t.add(10);
		t.add(30);
		t.add(20);
		
		System.out.println(t);
	}
}
