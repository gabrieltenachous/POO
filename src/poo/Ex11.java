package poo;
import java.util.Scanner;
public class Ex11 {
static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("(c) ou (f)");
        String temperatura = scanf.nextLine();
        switch(temperatura){
            case "c":
                celsius();
                break;
            case "f":
                farenheit();
                break;
        }
        
    }
    
    private static void celsius() {
        System.out.println("Temeperatura(furenigth)");
        double f = scanf.nextDouble();
        double c= 5*(f-32)/9;
        System.out.println(c);
    }

    private static void farenheit() {
        System.out.println("Temeperatura(celcius)");
        double c = scanf.nextDouble();
        double f = (9*c/5) + 32;
        System.out.println(f);
    }
}
