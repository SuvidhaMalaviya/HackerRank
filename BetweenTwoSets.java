package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int i,j,flag=0,flag2=0,factors=0;

        for (i=1;i<150;i++)
        {
            flag=0;
            flag2=0;
            for (j=0;j<a.size();j++)
            {
                if (i%a.get(j)!=0)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                for (j=0;j<b.size();j++)
                {
                    if (b.get(j)%i!=0)
                    {
                        flag2=1;
                        break;
                    }
                }
                if (flag2==0)
                    factors++;
            }
        }
        return factors;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result3.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
