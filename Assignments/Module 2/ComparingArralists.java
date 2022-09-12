package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class ComparingArralists {

	public static void main(String[] args) {
		ArrayList<String> Bikes = new ArrayList<>();
		Bikes.add("Bmw");
		Bikes.add("Yamaha");		
		Bikes.add("Ktm");		
		Bikes.add("Ninja");		
		Bikes.add("Suzuki");
		
		ArrayList<String> Bikes2 = new ArrayList<>();
		Bikes2.add("Bajaj");
		Bikes2.add("Honda");
		Bikes2.add("Hero");
		Bikes2.add("Mahindra");
		Bikes2.add("Tvs");
		
		boolean compare = Bikes.equals(Bikes2);
		
		System.out.println(compare);
	}
}
