package poo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
            Scanner scanf = new Scanner(System.in);
            System.out.println("A");
            double a=scanf.nextDouble();
            System.out.println("B");
            double b=scanf.nextDouble();
            System.out.println("C");
            double c=scanf.nextDouble();
            double valor=isDelta(a,b,c);
            System.out.println(valor);
	}
	public static double isDelta(double a,double b,double c){
           return b*b-4*-a*c;
        }

}
