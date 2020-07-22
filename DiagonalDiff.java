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

public class DiagonalDiff {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.write(String.valueOf("resuly"));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}



class Result {


    public static int diagonalDifference(List<List<Integer>> arr) {

        int lsum=0,rsum=0,ans=0,l=0,r=arr.size()-1;

        for (int i=0;i<arr.size();i++)
        {
            lsum+=arr.get(i).get(l);
            rsum+=arr.get(i).get(r);
            l++;
            r--;
        }

        ans=lsum-rsum;

        return Math.abs(ans);
    }

}
