package ProblemSolving;

import java.util.Scanner;

public class MinMaxSum {
    static void miniMaxSum(int[] arr)
    {
        int i,j;
        long min=Long.MAX_VALUE,max=Long.MIN_VALUE,sum=0;
        for (i=0;i<arr.length;i++)
        {
            sum=0;
            for (j=0;j<arr.length;j++)
            {
                if (i==j)
                    continue;
                sum+=arr[j];
            }
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }

        System.out.print(min+" "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

