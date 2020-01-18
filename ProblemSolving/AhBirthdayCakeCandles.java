package ProblemSolving;

import java.util.Scanner;

public class AhBirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] array = new int[n];

		int numberOfCandlesThatWillBeBlowOut = 0;
		int tallestCandleValue = 0;

		for (int i = 0; i < n; i++) {
			int arItem = scanner.nextInt();
			
			array[i] = arItem;

			if (array[i] > tallestCandleValue) {
				tallestCandleValue = array[i];
			}
	
		}

		scanner.close();

		for (int i = 0; i < n; i++) {

			if (tallestCandleValue == array[i]) {
				numberOfCandlesThatWillBeBlowOut += 1;
			}

		}

		System.out.println(numberOfCandlesThatWillBeBlowOut);

	}

}
