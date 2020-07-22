package ProblemSolving;

import java.util.Scanner;

public class SimpleArraySum
{
    static int simpleArraySum(int[] ar) {
        int sum=0;
        for (int i=0;i<ar.length;i++)
            sum+=ar[i];
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ary[],n;

        do {
            n=sc.nextInt();
        }while (n<=0);

        ary = new int[n];

        for (int i=0;i<n;i++)
        {
            do {
                ary[i]=sc.nextInt();
            }while (ary[i]>1000);
        }

        int sum=simpleArraySum(ary);
        System.out.println(sum);
    }

}
