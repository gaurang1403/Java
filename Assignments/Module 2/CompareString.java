package Module_2;

public class CompareString {

	public static void main(String[] args) {
		
		String s1 = "topsint.com";
		String s2 = "Topsint.com";
		
		int s3 = s1.compareToIgnoreCase(s2);
		int s4 = s1.compareTo(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
