package Module_2;

import java.util.Scanner;

public class OopEx14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		OopEx14 o = new OopEx14();
		
		System.out.println("Enter your marks out of 100");
		o.Grade(sc.nextInt());

	}

	public void Grade(int m) {
		if (m <= 100 && m >= 91) {
			System.out.println("Your grade is AA");
		} else if (m <= 100 && m >= 91) {
			System.out.println("Your grade is AB");
		} else if (m <= 90 && m >= 81) {
			System.out.println("Your grade is BB");
		} else if (m <= 80 && m >= 71) {
			System.out.println("Your grade is BC");
		} else if (m <= 70 && m >= 61) {
			System.out.println("Your grade is CD");
		} else if (m <= 60 && m >= 51) {
			System.out.println("Your grade is DD");
		} else if (m < 41) {
			System.out.println("Fail");
		}
	}
}
