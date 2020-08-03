package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeutifulDay {

    // Complete the beautifulDays function below.
    static int beautifulDays(int start, int end, int k) {

        int count=0;
        for (int i=start;i<=end;i++)
        {
            int rem,rev=0,temp=i;
            while (temp!=0)
            {
                rem=temp%10;
                rev=(rev*10)+rem;
                temp=temp/10;
            }
            if ((i-rev)%k==0)
                count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

