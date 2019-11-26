package Lista02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Ano ano = new Ano();
        System.out.println("que ano?");
        ano.setAno(scanf.nextInt());
        System.out.println(ano.isBissexto());
        ano.exibirBissexto();
    }

}
