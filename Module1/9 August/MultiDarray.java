package August_9;

public class MultiDarray {

	public static void main(String[] args) {

		int array[][] = { { 1, 2, 6 }, { 5, 2, 96 }, { 154, 221, 21 },

		};
		
		for(int i = 0; i<array.length; i++ ) {
			
			for(int j = 0; j<array.length; j++) {
				
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}
	}
}
