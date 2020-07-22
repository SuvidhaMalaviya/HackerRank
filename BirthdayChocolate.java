package ProblemSolving;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {

        int i,count=0,j,sum;

        for (i=0;i<s.size();i++)
        {
            sum=0;
            for (j=i;j<m+i;j++)
            {
                if (j<s.size())
                    sum+=s.get(j);
            }
            if (sum==d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

