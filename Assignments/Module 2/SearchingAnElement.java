package Module_2;

import java.util.ArrayList;

public class SearchingAnElement {

	public static void main(String[] args) {

		ArrayList<String> Company = new ArrayList<>();

		Company.add("Tata");
		Company.add("Birla");
		Company.add("Adani");
		Company.add("Reliance");
		Company.add("Wipro");

		if (Company.contains("Wipro")) {
			System.out.println("Yes, Company contains at index: " + Company.indexOf("Wipro"));
		}

		else {
			System.out.println("No, It doesn't contain this element");
		}

	}
}
