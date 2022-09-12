package Module_2;

import java.util.Scanner;

public class ExceptionAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();	
		if(age>=18) {
			System.out.println("Welcome to vote");
		}
		else {
			throw new ArithmeticException("Not valid");
		}
		
		
		
		
	}
}
