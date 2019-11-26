package Lista02;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Primo primo = new Primo();
        System.out.println("digite o valor");
        primo.setPrimo(scanf.nextInt());
        
        primo.mostrarPrimo();
    }

}
