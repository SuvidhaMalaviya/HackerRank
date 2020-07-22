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

public class MigratoryBird {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        List<Integer> distinctType=new ArrayList<>(new HashSet<>(arr));
        List<Integer> freq =new ArrayList<>();
        int i,j,count=0,max=Integer.MIN_VALUE,index=Integer.MAX_VALUE;

        for (i=0;i<distinctType.size();i++)
        {
            count=0;
            for (j=0;j<arr.size();j++)
            {
                if (arr.get(j)==distinctType.get(i))
                {
                    count++;
                }
            }
            freq.add(i,count);
            max=Math.max(max,count);
        }
        for (i=0;i<freq.size();i++)
        {
            if (freq.get(i)==max)
                index=Math.min(distinctType.get(i),index);

        }

        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

