package ProblemSolving;

import java.util.*;

public class AePlusMinus {

	public static void main(String[] args) {

		int i = 0;
		int userInput = 0;

		float positivNumberCounter = 0f;
		float negativNumberCounter = 0f;
		float zeroNumberCounter = 0f;

		float positivNumberRatio = 0f;
		float negativNumberRatio = 0f;
		float zeroNumberRatio = 0f;

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		while (i < length) {

			userInput = sc.nextInt();

			if (userInput > 0) {
				positivNumberCounter += 1;
				i++;
			} 

			if (userInput < 0) {
				negativNumberCounter += 1;
				i++;

			}
			
			if (userInput == 0) {
				zeroNumberRatio += 1;
				i++;

			}

		}

		positivNumberRatio = positivNumberCounter / length;
		negativNumberRatio = negativNumberCounter / length;
		zeroNumberRatio = zeroNumberRatio / length;

		System.out.printf("%.5f %.5f %.5f", positivNumberRatio, negativNumberRatio, zeroNumberRatio);

		sc.close();
	}
}