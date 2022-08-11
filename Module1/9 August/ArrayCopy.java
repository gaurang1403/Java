package August_9;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int number1[] = {43,54,65};
		int number2[] = new int [10];
		
		System.arraycopy(number1, 0, number2, 7, 3);
		
		for (int i : number2) {
			
			System.out.println(i);
		}
	}
}
