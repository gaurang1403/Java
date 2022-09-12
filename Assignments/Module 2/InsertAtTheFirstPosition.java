package Module_2;

import java.util.ArrayList;

public class InsertAtTheFirstPosition {

	public static void main(String[] args) {

		ArrayList<String> instruments = new ArrayList<>();

		instruments.add("Flute");
		instruments.add("Harmonium");
		instruments.add("Tabla");
		instruments.add("Piano");
		instruments.add("Drum");

		System.out.println(instruments);

		instruments.add(0, "Organ");
		System.out.println(instruments);

		instruments.remove(5);
		System.out.println(instruments);
	}
}
