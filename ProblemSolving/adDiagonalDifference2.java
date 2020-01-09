package ProblemSolving;
import java.util.Scanner;

public class adDiagonalDifference2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int diagonalLeftToRight = 0;
		int diagonalRightToLeft = 0;
		int linha;
		int coluna;
		int matrixFormat = sc.nextInt();

		int[][] matrix = new int[matrixFormat][matrixFormat];

		for (linha = 0; linha < matrixFormat; linha++)
			for (coluna = 0; coluna < matrixFormat; coluna++) {
				matrix[linha][coluna] = sc.nextInt();
			}

//		From another Programmer
//		for (linha = 0; linha < matrixFormat; linha++) {
//			diagonalLeftToRight += matrix[linha][linha];
//		}
//		for (linha = 0, coluna = matrixFormat - 1; linha < matrixFormat; linha++, coluna--) {
//			diagonalRightToLeft += matrix[linha][coluna];
//		}

		for (linha = 0, coluna = 0; linha < matrixFormat; linha++, coluna++) {
			diagonalLeftToRight += matrix[linha][coluna];
		}

		for (linha = 0, coluna = matrixFormat - 1; coluna >= 0; linha++, coluna--) {
			diagonalRightToLeft += matrix[linha][coluna];
		}

		System.out.println(Math.abs(diagonalLeftToRight - diagonalRightToLeft));
		
		sc.close();
		
	}
}