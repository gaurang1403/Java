package August_13;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int value = 0;
		if (this.id < o.id) {
			return -1;
		} else if (this.id == o.id) {
			return 0;
		} else if (this.id > o.id) {
			return 1;
		}

		return value;
	}

}

public class ComparableEx {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Gaurang");
		Student s2 = new Student(5, "Ramesh");
		Student s3 = new Student(3, "Suresh");
		Student s4 = new Student(8, "Vijay");
		Student s5 = new Student(9, "Atul");

		ArrayList<Student> as = new ArrayList<>();

		as.add(s1);
		as.add(s2);
		as.add(s3);
		as.add(s4);
		as.add(s5);

		Collections.sort(as);

		for (Student student : as) {

			System.out.println(student.id + " " + student.name);

		}
	}
}
