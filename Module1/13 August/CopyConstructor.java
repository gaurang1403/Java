package August_13;

class Student2 {
	int id;
	String name;

	Student2(int id, String name) {

		this.id = id;
		this.name = name;
	}
	Student2(Student2 s){
		
		id = s.id;
		name = s.name;
		
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Student2 s  = new Student2(1, "Gaurang");
		Student2 s2  = new Student2(s);
		
		s.display();
		s2.display();
	}
}
