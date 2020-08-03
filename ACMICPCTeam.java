package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic)
    {
        List<Integer> knownTopic=new ArrayList<>();
        int ans[]=new int[2];
        ans[0]=Integer.MIN_VALUE;
        ans[1]=0;

        for (int i=0;i<topic.length;i++)
        {
            for (int j=i+1;j<topic.length;j++)
            {
                char[] c1=topic[i].toCharArray();
                char[] c2=topic[j].toCharArray();

                int diff=findDiff(c1,c2);
                knownTopic.add(diff);
            }
        }

        for (int i=0;i<knownTopic.size();i++)
        {
            if (knownTopic.get(i)>ans[0])
                ans[0]=knownTopic.get(i);
        }

        for (int i=0;i<knownTopic.size();i++)
        {
            if (ans[0]==knownTopic.get(i))
            {
                ans[1]++;
            }
        }

        return ans;
    }

    private static int findDiff(char[] c1, char[] c2)
    {
        int sum=0;
        for (int i=0;i<c1.length;i++)
        {
            int j1=Character.getNumericValue(c1[i]);
            int j2=Character.getNumericValue(c2[i]);
            sum+=j1 | j2;
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
