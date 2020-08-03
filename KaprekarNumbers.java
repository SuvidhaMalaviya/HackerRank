package ProblemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class KaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q)
    {
        int left=0,right=0,sum=0,flag=0;
        for (int i=p;i<=q;i++)
        {
            sum=0;
            left=0;
            right=0;
            long sq=(long) Math.pow(i,2);
            String square = String.valueOf(sq);
            String l= square.substring(0,(square.length()/2));
            String r=square.substring(square.length()/2);
            if (!l.isEmpty())
                left=Integer.parseInt(l);
            if (!r.isEmpty())
                right=Integer.parseInt(r);

            sum=left+right;

            if (sum==i)
            {
                flag=1;
                System.out.print(i+" ");
            }

        }
        if (flag==0)
            System.out.println("INVALID RANGE");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
