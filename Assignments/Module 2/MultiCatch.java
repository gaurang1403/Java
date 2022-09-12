package Module_2;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			int[] arr = new int[5];
			arr[10] = 34;
			arr[5] = 30 / 0;
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
		}
	}
}
