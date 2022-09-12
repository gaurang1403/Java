package Module_2;

public class TestThreadTwice extends Thread{

	public void run () {
		System.out.println("This is Gaurang");
	}
	
	public static void main(String[] args) {
		TestThreadTwice t1=new TestThreadTwice();
		try {
		t1.start();
		t1.start();
		}
		catch (Exception e) {
			System.out.println("something is wrong with method");
		}
	}	
	
}
