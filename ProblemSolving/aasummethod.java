package ProblemSolving;

import java.util.*;


public class aasummethod {

	public static int a;
	public static int b;

	public static int SolveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		// Type the numbers at console after running the code.
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		in.close();
		
		System.out.println(SolveMeFirst(a, b));
			
	}
	
}
