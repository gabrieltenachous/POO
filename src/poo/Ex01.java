package poo;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Digita um valor");
        double num = scanf.nextInt(); //15
        boolean novo = isPositivo(num);
        if(novo==true){
            System.out.println("positivo");
        }else{
            System.out.println("negativo");
        }
    }
    
    public static boolean isPositivo(double num) {
        return num>0;
    }
}