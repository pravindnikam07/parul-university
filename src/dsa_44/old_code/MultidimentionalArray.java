package dsa_44.old_code;

public class MultidimentionalArray {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			{1,2,3,4},
			{12,13,14,15},
			{34,36, 39,41}
		};
		
		// n * m => 3 * 4
		
		for(int i = 0; i < matrix[0].length; i++) {
			int sum = 0;
			for(int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];
			}
			System.out.println(sum);
		}
	}
}
