package Module_2;

class Parent {
	public void print() {
		System.out.println("This is a parent class");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("this is a child class");
	}
}

public class OopEx4 {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();

		p.print();
		c.display();
		c.print();

	}
}
