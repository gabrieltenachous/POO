package Frutera;

import java.util.Scanner;

public class Fruteira {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int tamanho = 0;//tamanho da cesta
        Maca maca = new Maca();
        Banana banana = new Banana();
        System.out.println(maca);
        do {
            System.out.println("Quantas cestas");
            tamanho = scanf.nextInt();
        } while ((tamanho <= 1) || (tamanho >= 100));
        Fruta[] fruta = new Fruta[tamanho];

    }

}
