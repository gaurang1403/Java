package Module_2;

public class threadClass extends Thread{

	public void run() {
		System.out.println("Thread by thread class");
		
	}
	public static void main(String[] args) {
		

		threadClass T = new threadClass();
	
		T.start();
		
	}
	
}
