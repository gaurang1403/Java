package Module_2;

import java.util.Scanner;

class InsufficientBalance extends Exception {
	private String message;

	public InsufficientBalance(String message) {
		this.message = message;

	}

	public InsufficientBalance(Throwable cause, String message) {

		this.message = message;

	}

	public String getMessage() {
		return message;

	}
}

public class Custom_Exception {

	public static void main(String[] args) throws InsufficientBalance {
		int balance = 25000;

		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO BHAI BHAI COOPERATIVR BANK");
		System.out.println("Your current Balance is 25000");
		System.out.println("Enter amount you to Dabit");
		int amount = sc.nextInt();

		if (amount > balance) {
			throw new InsufficientBalance("Insufficient Balance");
		}
		if (amount < 2000) {
			System.out.println("Minimum withdraw amount is 2500");
		} else {

			System.out.println("Transaction Completed");

		}

	}

}
