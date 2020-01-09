package ProblemSolving;
import java.io.*;
import java.util.*;

public class acCompareTheTriplets {
	
	public static int alicePoints;
	public static int bobPoints;

	static void compareTriplets(int[] a, int[] b) {
		
		
		if (a [0] > b [0]) {
			alicePoints ++;
		}
		
		if (a [1] > b [1]) {
			alicePoints ++;
		}
		
		if (a [2] > b [2]) {
			alicePoints ++;
		}
		
		if (b [0] > a [0]) {
			bobPoints ++;
		}
		
		if (b [1] > a [1]) {
			bobPoints ++;
		}
		
		if (b [2] > a [2]) {
			bobPoints ++;
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int [] arrayAlice = {a, b, c};
		
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int [] arrayBob = {a2, b2, c2};

		compareTriplets (arrayAlice, arrayBob);

		System.out.println( alicePoints + ", " + bobPoints);

		sc.close();

	}

	

}