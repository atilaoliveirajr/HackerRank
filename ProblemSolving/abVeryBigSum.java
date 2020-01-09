package ProblemSolving;
import java.io.*;
import java.util.*;

public class abVeryBigSum {

	static long aVeryBigSum(long[] array) {
		int length = array.length;
		long sum = 0;

		for (int i = 0; i < length; i++) {
			sum += array[i];
		}
		return sum;

	}	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, inser array length.");
		int length = Integer.parseInt(sc.nextLine().trim());
		
		long[] array = new long[length];

		System.out.println("Please, inser the value of the array's elements separated by space.");
		String[] userInput = sc.nextLine().split(" ");
		
		for (int i = 0; i < length; i++) {
			long arItem = Long.parseLong(userInput[i].trim());
			array[i] = arItem;
		}

		long result = aVeryBigSum(array);

		System.out.println(result);

		sc.close();

	}
}
