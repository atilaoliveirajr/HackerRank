package InterviewPreparationKit;

import java.util.*;

public class aaSockMerchant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int array[] = new int[arrayLength];

		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();

		int counter = 0;

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != -1 && array[j] != -1) {
					counter++;
					array[i] = -1;
					array[j] = -1;
					break;
				}
			}
		}
		
		System.out.println(counter);
		
		scanner.close();
	}
	
	
}