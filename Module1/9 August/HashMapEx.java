package August_9;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, Integer> index = new HashMap<>();

		index.put("A", 1);
		index.put("B", 2);
		index.put("C", 3);
		index.put("D", 4);

		for (Entry<String, Integer> i : index.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());

		}

//		System.out.println(index);
	}
}
