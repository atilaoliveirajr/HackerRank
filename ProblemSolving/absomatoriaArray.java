package ProblemSolving;
import java.util.*;

public class absomatoriaArray {

	static Integer simpleArraySum(int[] array) {
		int length = array.length;
		int sum = 0;

		for (int i = 0; i < length; i++) {
			sum += array[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, inser array length.");
		int length = Integer.parseInt(sc.nextLine().trim());
				
		int [] array = new int [length];
		
		System.out.println("Please, inser the value of the array's elements separated by space.");
		String[] userInput = sc.nextLine().split(" ");
		
		for (int i = 0; i < length; i++) {
			int arItem = Integer.parseInt(userInput[i].trim());
			array[i] = arItem;
		}
		
		sc.close();
		
		System.out.println("The sum of the arrays elements is: " + simpleArraySum(array));
		
		
		
	}	
}