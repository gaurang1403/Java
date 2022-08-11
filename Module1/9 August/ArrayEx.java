package August_9;

public class ArrayEx {

	public static void main(String[] args) {

		int marks[] = { 87, 98, 54, 76, 45 };

		int number[] = new int[5];
		number[0] = 43;
		number[1] = 56;
		number[2] = 73;
		number[3] = 87;
		number[4] = 93;

		for (int i : number) {

			System.out.println(i);
		}

		System.out.println("-----------------------");
		
		for (int j : marks) {
			System.out.println(j);
		}
	}

}
