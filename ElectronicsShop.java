package ProblemSolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int keyboards[], int[] drives, int b) {
        int ans=-1,i,j;
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        for (i=keyboards.length-1,j=0;i>=0;i--)
        {
            for (;j<drives.length;j++)
            {
                if (keyboards[i]+drives[j] > b)
                    break;
                if (keyboards[i]+drives[j]>ans)
                    ans=keyboards[i]+drives[j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }

        System.out.println(getMoneySpent(keyboards,pendrives,s));

    }
}
