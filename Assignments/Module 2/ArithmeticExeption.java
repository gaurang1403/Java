package Module_2;

import java.util.Scanner;

public class ArithmeticExeption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend and Divisor");
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();

		try {
			int division = dividend / divisor;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("Enter valid divisor");
		}
	}
}
