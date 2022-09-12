package Module_2;

class Print {
	public void Displal(int n, char c) {
		System.out.println(n + " " + c);
	}

	public void Display(char c, int n) {
		System.out.println(n + " " + c);
	}
}

public class OopEx2 {
	public static void main(String[] args) {
		Print p = new Print();
		p.Displal(8, 'a');
		p.Display('a', 8);
	}

}
