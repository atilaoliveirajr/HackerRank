package ProblemSolving;
import java.io.*;
import java.util.*;

public class adDiagonalDifference {
	public static void main(String[] args) throws IOException {

		int diagonalLeftToRight = 0;
		int diagonalRightToLeft = 0;
		int i;
		int j;
				
		Scanner sc = new Scanner(System.in);

		int matrixFormat = sc.nextInt();
		int[][] matrix = new int[matrixFormat][matrixFormat];

		for (i = 0; i < matrixFormat; i++) {
			for (j = 0; j < matrixFormat; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (i = 0, j = 0; i < matrixFormat; i++, j++) {
			diagonalLeftToRight += matrix[i][j];
		}
		
						
		for (i = 0, j = matrixFormat-1; j >= 0; i++, j--) {
			diagonalRightToLeft += matrix[i][j];
		}
				
		System.out.println(diagonalLeftToRight + diagonalRightToLeft);
		
		sc.close();

	}
}