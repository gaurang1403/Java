package Module_2;

import java.util.Scanner;

public class Reading10IntException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Values");
		int a = sc.nextInt();
		if (a < 10 || a > 40) {
			throw new ArithmeticException("Enter values between 10 and 40");
		} else {
			System.out.println(a);
		}
	}
}
