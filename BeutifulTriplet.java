package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeutifulTriplet {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr)
    {
        int count=0,sum1=0,sum2=0,i,j,k;
        for (i=0;i<arr.length;i++)
        {
            sum1=0;
            sum2=0;
            for (j=i+1;j<arr.length;j++)
            {
                sum1=arr[j]-arr[i];
                if (sum1 == d)
                {
                    for (k=j+1;k<arr.length;k++)
                    {
                        sum2=arr[k]-arr[j];
                        if (sum2 == d)
                            count++;
                    }
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
