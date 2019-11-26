package poo;

import java.util.Scanner;
public class Ex02 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("digite um valor");
        double num=scanf.nextDouble();
        boolean novo=isZero(num);
        if(novo==true){
            System.out.println("nulo");
        }else{
            System.out.println("nao é nulo");
        }
    }

    public static boolean isZero(double num){
        return num==0;
    }
}
