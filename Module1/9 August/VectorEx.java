package August_9;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>(2);
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		if(v.contains("a")) {
			System.out.println("Called");
		}
		else {
			System.out.println("not called");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
}
