package Module_2;

import java.util.Scanner;

abstract class Marks {
	abstract public void getPercentage();
}

class A extends Marks {

	float sub1, sub2, sub3;

	public A(float sub1, float sub2, float sub3) {

		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;

	}

	@Override
	public void getPercentage() {

		float percentage = (sub1 + sub2 + sub3) / 300 * 100;
		System.out.println("Your Percentage is " + percentage);

	}

}

class B extends Marks {

	float subject1, subject2, subject3, subject4;

	public B(float subject1, float subject2, float subject3, float subject4) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}

	@Override
	public void getPercentage() {
		float percentage = (subject1 + subject2 + subject3 + subject4) / 400 * 100;
		System.out.println("Your Percentage is " + percentage);
	}

}

public class OopEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks out of 100");
		A a = new A(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		a.getPercentage();

		System.out.println("-----------------------------");

		System.out.println("Enter Marks out of 100");
		B b = new B(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		b.getPercentage();

	}
}
