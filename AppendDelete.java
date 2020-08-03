package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k)
    {
        int i;

        for (i=0;i<s.length() && i<t.length();i++)
        {
            if (s.charAt(i)!=t.charAt(i))
                break;
        }
        int ans=(s.length()-i)+(t.length()-i);

        if ((s.length()+t.length()-k)<0)
            return  "Yes";
        else if (ans<=k)
        {
            if (ans==0)
                return "Yes";
            else
            {
                if ((k-ans)==0)
                    return "Yes";
                else
                {
                    if ((k-ans)%2==0)
                        return "Yes";
                    else
                        return "No";
                }
            }
        }
        else
            return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
