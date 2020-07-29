package test;

public class PrimeNumberGenerator {

	private static final int DIMENSION_SIZE = 100;

	// Main program
	public static void main(String[] args) {

		int[][] matrix = generateMatrix();
		showMatrix(matrix);

	}

	// Method to show matrix in console
	private static void showMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			System.out.print(i);

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}

	}

	private static int[][] generateMatrix() {

		int[][] matrixResult = new int[DIMENSION_SIZE][DIMENSION_SIZE];
		int[] array = new int[DIMENSION_SIZE];

		for (int idxRow = 0; idxRow < matrixResult.length; idxRow++) {
			array = decomposeNumber(idxRow);
			
			for (int idxColumn = 0; idxColumn < matrixResult[idxRow].length; idxColumn++) {
				matrixResult[idxRow][idxColumn] = array[idxColumn];

			}

		}

		return matrixResult;
	}

	private static int[] decomposeNumber(int myNumber) {

		int[] result = new int[DIMENSION_SIZE];
		int i = 2;

		if (myNumber > 0) {

			while (myNumber != 1) {

				if (myNumber % i == 0) {

					myNumber = myNumber / i;
					result[i]++;

				} else {
					i += 1;
				}

			}

		}

		return result;

	}

}
