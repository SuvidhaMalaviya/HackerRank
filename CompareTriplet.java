package ProblemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplet {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> comp_out = new ArrayList<Integer>();
        int a_count=0,b_count=0;

        for (int i=0;i<a.size();i++)
        {
            if (a.get(i)>b.get(i))
                a_count++;
            else if (a.get(i)<b.get(i))
                b_count++;
        }
        comp_out.add(a_count);
        comp_out.add(b_count);

        return comp_out;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<Integer>();
        List<Integer> b=new ArrayList<Integer>();
        int i;

        for (i=0;i<3;i++)
            a.add(sc.nextInt());
        for (i=0;i<3;i++)
            b.add(sc.nextInt());

        List<Integer> result = compareTriplets(a, b);

        for (i=0;i<2;i++)
            System.out.print(result.get(i)+" ");
    }
}

