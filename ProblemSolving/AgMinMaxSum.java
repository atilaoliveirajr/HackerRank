package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class AgMinMaxSum {

    
    static void miniMaxSum(long[] array) {
    	Arrays.sort(array);
    	
    	System.out.println(array[0] + array[1] + array[2] + array[3] + " " + (array[1] + array[2] + array[3] + array[4]));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        long [] array = new long[5];

        String [] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            array[i] = arrItem;
        }

        miniMaxSum(array);

        scanner.close();
    }
}
