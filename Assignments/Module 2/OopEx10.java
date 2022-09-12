package Module_2;

abstract class Bank {
	abstract public void getBalance(int amount);
}

class BankA extends Bank {

	@Override
	public void getBalance(int amount) {
		System.out.println(amount + " is Deposited in bank A");
	}

}

class BankB extends Bank {

	@Override
	public void getBalance(int amount) {
		System.out.println(amount + " is Deposited in bank B");
	}

}

class BankC extends Bank {

	@Override
	public void getBalance(int amount) {
		System.out.println(amount + " is deposited in bank C");
	}

}

public class OopEx10 {
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		a.getBalance(100);
		b.getBalance(150);
		c.getBalance(200);
	}
}
