package ProblemSolving;

import java.util.Scanner;

public class AiGrandingStudents {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfStudents = scanner.nextInt();
		int restOfDivisionBy5;
		int grade = 0;
		
		int[] array = new int[numberOfStudents];

		

		for (int i = 0; i < array.length; i++) {
			grade = scanner.nextInt();
			restOfDivisionBy5 = grade % 5;
			
			if (grade >= 38 && restOfDivisionBy5 >= 3) {
				
				grade = grade - restOfDivisionBy5 + 5;
			}
			
			int arItem = grade;

			array[i] = arItem;
			System.out.println(arItem);
			
		}

		scanner.close();
		

	}

}
