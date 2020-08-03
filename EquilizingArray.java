package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EquilizingArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(List<Integer> arr)
    {
        List<Integer> distinct = new ArrayList<>(new HashSet<Integer>(arr));
        List<Integer> frequency = new ArrayList<>();
        int count,max=Integer.MIN_VALUE,occur=0;

        for (int i=0;i<distinct.size();i++)
        {
            count=0;
            for (int j=0;j<arr.size();j++)
            {
                if (distinct.get(i)== arr.get(j))
                {
                    count++;
                }
            }
            frequency.add(count);
        }

        for (int i=0;i<frequency.size();i++)
        {
            if(frequency.get(i) > max)
            {
                max=frequency.get(i);
            }
        }
        count=0;
        for (int i=0;i<frequency.size();i++)
        {
            if (frequency.get(i) == max && occur<=0)
            {
                occur++;
                continue;
            }
            count+=frequency.get(i);
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> arr = new ArrayList<>();

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
