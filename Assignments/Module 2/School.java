package Module_2;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
	private String message;

	public AgeNotWithinRangeException(String message) {
		this.message = message;

	}

	public String getMessage() {
		return message;

	}
}

class NameNotValidException extends Exception {
	private String message;

	public NameNotValidException(String message) {
		this.message = message;

	}

	public String getMessage() {
		return message;

	}
}

public class School {

	int roll_no;
	int age;
	String name;
	String Course;

	public School(int roll_no, int age, String name, String Course) throws Exception {

		this.roll_no = roll_no;
		this.age = age;
		this.name = name;
		this.Course = Course;
		
		if(this.age <15 || this.age> 21 ) {
			throw new AgeNotWithinRangeException("Please Enter age between 15 and 21");
		};
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		
		School s = new School(sc.nextInt(),sc.nextInt(), sc.next(),  sc.next());

	}

}
