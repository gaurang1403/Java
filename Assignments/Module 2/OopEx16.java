package Module_2;

import java.util.Scanner;

public class OopEx16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		try {
			int n = sc.nextInt();
			System.out.println(n*n);
			
		} catch (Exception e) {
			System.out.println("Enter valid value");
		} 
	}
}
