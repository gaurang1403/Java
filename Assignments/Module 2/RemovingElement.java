package Module_2;

import java.util.ArrayList;

public class RemovingElement {

	public static void main(String[] args) {
		
		ArrayList<String> Car = new ArrayList<>();
		
		Car.add("800");
		Car.add("Swift");
		Car.add("Eon");
		Car.add("WagonR");
		Car.add("Acent");
		
		System.out.println(Car);
		
		Car.remove(3);
		System.out.println(Car);
		Car.sort(null);
		
		System.out.println(Car);

	}
}
