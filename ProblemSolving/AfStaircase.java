package ProblemSolving;

import java.util.*;

public class AfStaircase {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
        int i;
        int j;
        int k;
                        
        n = scanner.nextInt();
        
        scanner.close();
        
        for(i=1;i<=n;i++) {
            for(j=i;j<n;j++) {
                System.out.print(" ");
            }
            
            for(k=0;k<i;k++)
                System.out.print("#");
            System.out.println();
        }
        
    }
}