package Module_2;

class calculation {
	public void Factorial(int a) {
		int fact = 1;

		for (int i = a; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + " is " + fact);
	}
}

public class OopEx12 {
	
	public static void main(String[] args) {
		
		calculation c = new calculation();
		c.Factorial(10);
		
	}
}
