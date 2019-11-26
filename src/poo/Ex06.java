package poo;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n1 = scanf.nextInt();
        int n2 = scanf.nextInt();
        int total = menorMath(n1, n2);
        System.out.println(total);
    }

    public static int menorMath(int n1, int n2) {
        return Math.max(n2, n2);
    }

}
