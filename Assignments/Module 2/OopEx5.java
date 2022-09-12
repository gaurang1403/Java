package Module_2;

class member {
	String name;
	int age;
	String number;
	String address;
	int salary;

	public void printSalary() {

		System.out.println("Salary " + salary);

	}

}

class Employee extends member {
	String Specialization;
}

class Manager extends member {
	String Department;

}

public class OopEx5 {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Gaurang";
		e.age = 21;
		e.address = "Rajkot";
		e.number = "1234";
		e.salary = 30000;
		e.Specialization = "Java Developer";
//	---------------------------------------------------------------	
		Manager m = new Manager();
		m.name = "Pandya";
		m.age = 30;
		m.address = "Rajkot";
		m.number = "5678";
		m.salary = 50000;
		m.Department = "R&D";
//	----------------------------------------------------------------
		m.printSalary();
		System.out.println("--------------------");
		e.printSalary();
	}
}
