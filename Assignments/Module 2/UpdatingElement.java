package Module_2;

import java.util.ArrayList;

public class UpdatingElement {

	public static void main(String[] args) {
		
		ArrayList<String> Lang = new ArrayList<>();
		Lang.add("Gujarati");
		Lang.add("Hindi");
		Lang.add("Tamil");
		Lang.add("Telugu");
		Lang.add("Bengali");
		
		System.out.println(Lang);
		
		Lang.set(2, "English");
		System.out.println(Lang);

	}
}
