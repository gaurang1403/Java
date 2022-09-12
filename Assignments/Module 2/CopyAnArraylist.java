package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class CopyAnArraylist {

	public static void main(String[] args) {

		ArrayList<String> State = new ArrayList<>();

		State.add("Gujarat");
		State.add("Maharashtra");
		State.add("MadhyaPradesh");
		State.add("Rajasthan");
		State.add("Uttarakhand");

		System.out.println(State);

		ArrayList<String> Country = new ArrayList<>();

		System.out.println("---------------------------------------");
		
		Country.add("India");
		Country.add("Spain");
		Country.add("Italy");
		Country.add("Portugal");
		Country.add("Argentina");

		System.out.println(Country);

		System.out.println("---------------------------------------");
		
		Collections.copy(Country, State);

		System.out.println("After Copy");
		
		System.out.println(State);
		
		System.out.println(Country);

	}
}
