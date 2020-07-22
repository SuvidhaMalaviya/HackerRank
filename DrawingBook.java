package ProblemSolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int i=1,front=1,rear=1;

        if (p==1)
            return 0;
        else
        {
            i=3;
            while (i<p)
            {
                front++;
                i+=2;
            }
            i=n;
            if (n%2==0)
            {
                i=n-2;
                if (p==n)
                    return 0;
                else
                {
                    while (i>p)
                    {
                        rear++;
                        i-=2;
                    }
                }
            }
            else
            {
                i=n-3;
                if (p==n || p==n-1)
                    return 0;
                else
                {
                    while (i>p)
                    {
                        rear++;
                        i-=2;
                    }
                }
            }
        }
        System.out.println(front+" "+rear);
        return Math.min(front,rear);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n,p;

        do {
            n = scanner.nextInt();
        }while (n<1 || n>100000);

        do {
            p = scanner.nextInt();
        }while (p<1 || p>n);

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
