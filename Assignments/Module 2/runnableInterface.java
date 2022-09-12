package Module_2;

public class runnableInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Executed");
	}
	
	public static void main(String[] args) {
		
		runnableInterface r = new runnableInterface();
		
		Thread t = new Thread(r);
		t.start();
		
		
		
	}
	
}
