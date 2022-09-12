package Module_2;

abstract class parent1 {

	public void message() {
		System.out.println("This is Parent Class");
	}
}

class First extends parent1 {
	public void message() {
		System.out.println("This is first subclass");
	}
}

class Second extends parent1 {
	public void message() {
		System.out.println("This is second subclass");
	}
}

public class OopEx9 {
	
	public static void main(String[] args) {
		First f = new First();
		Second c = new Second();
		
		f.message();
		System.out.println("---------------------");
		c.message();
	}

}

