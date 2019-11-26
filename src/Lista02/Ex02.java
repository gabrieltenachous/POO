package Lista02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o numero (1)");
        calculadora.setNumero1(scanf.nextInt());
        System.out.println("Digite o numero (2)");
        calculadora.setNumero2(scanf.nextInt());

        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());
        
    }

}
