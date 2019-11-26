package poo;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n1 = scanf.nextInt();
        int n2 = scanf.nextInt();
        int n3 = scanf.nextInt();
        int total = menorMath(n1, n2, n3);
        System.out.println(total);
    }

    public static int menorMath(int n1, int n2, int n3) {
         return Math.max(Math.max(n1, n2),Math.max(n2, n3));
    }

}
