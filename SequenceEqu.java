package ProblemSolving;

import java.util.Scanner;

public class SequenceEqu
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int[] invers;
        int n,num;

        do {
            n=scanner.nextInt();
        }while (n<1 || n>50);

        invers=new int[n+1];

        for (int i=1;i<=n;i++)
        {
            do {
                num=scanner.nextInt();
            }while (num<1 || num>50);

            invers[num]=i;
        }

        for (int i=1;i<=n;i++)
            System.out.println(invers[invers[i]]);
    }
}
