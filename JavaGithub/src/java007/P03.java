package java007;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { { 1, 2, 3 }, { 4, 5 } };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
