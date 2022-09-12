package Module_2;

class PrintNumber {

	public void printn(int a) {
		System.out.println(a);
	}

	public void printn(float a) {
		System.out.println(a);
	}

	public void printn(double a) {
		System.out.println(a);
	}

	public void printn(char a) {
		System.out.println(a);
	}
}

public class OopEx1 {
	public static void main(String[] args) {
		PrintNumber n = new PrintNumber();
		n.printn(5);
		n.printn(1.5f);
		n.printn(2.33333333);
		n.printn('a');
	}
}
