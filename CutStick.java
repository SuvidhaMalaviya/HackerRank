package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutStick {

    // Complete the cutTheSticks function below.
    static List<Integer> cutTheSticks(int[] arr)
    {
        int min;
        int count=0,i=0,element=0;
        List<Integer> out =new ArrayList<>();

        while (count!=arr.length)
        {
            element=0;
            min=findMin(arr);

            for (i=0;i<arr.length;i++)
            {
                if (arr[i]!=Integer.MAX_VALUE)
                {
                    if (arr[i] == min)
                    {
                        count++;
                        arr[i] = Integer.MAX_VALUE;
                        element++;
                    }
                    else
                    {
                        arr[i] -= min;
                        element++;
                    }
                }
            }
            out.add(element);
        }
        return out;
    }

    static int findMin(int[] arr)
    {
        int min=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        List<Integer> result = cutTheSticks(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

