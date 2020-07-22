package ProblemSolving;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirsts(int a, int b) {
        return a+b;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirsts(a, b);
        System.out.println(sum);
    }
}
