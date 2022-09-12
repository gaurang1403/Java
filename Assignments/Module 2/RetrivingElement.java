package Module_2;

import java.util.ArrayList;

public class RetrivingElement {

	public static void main(String[] args) {

		ArrayList<String> Movies = new ArrayList<>();

		Movies.add("TopGun");
		Movies.add("GrayMan");
		Movies.add("ForestGump");

		System.out.println(Movies.get(2));
	}
}
