package Module_2;


class sleepThread1 extends Thread {
	
	public void run() {
		
		System.out.println("This is thread 1");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
}
class sleepThread2 extends Thread {
	
	public void run() {
		
		System.out.println("This is thread 2");
		
	}
	
}

public class sleepThread {
	
	public static void main(String[] args) {
		
		sleepThread1 s1 = new sleepThread1();
		sleepThread2 s2 = new sleepThread2();
		
		s1.start();
		s2.start();
		
		
		
	}
	
}