package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] temp=s.split(":");
        String last=temp[temp.length-1];
        String ampm=last.substring(last.length()-2,last.length());

        int finaltime=Integer.parseInt(temp[0])+12;

        if (ampm.equals("PM") && finaltime==24)
        {
            s= temp[0]+":"+temp[1]+":"+last.substring(0,2);
            return s;
        }
        if (ampm.equals("PM"))
        {
            s= String.valueOf(finaltime)+":"+temp[1]+":"+last.substring(0,2);
            return s;
        }
        if (ampm.equals("AM") && finaltime==24)
        {
            s= "00:"+temp[1]+":"+last.substring(0,2);
            return s;
        }
        else {
            s = s.substring(0, 8);
            return s;
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.print(result);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

