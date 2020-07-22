package ProblemSolving;

import java.util.Scanner;

public class StairCase {
    // Complete the staircase function below.
    static void staircase(int n) {
        int i,j,k;

        for (i=0;i<n;i++)
        {
            for (j=0;j<(n-1-i);j++)
            {
                System.out.print(" ");
            }
            for (k=0;k<i+1;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

