package Lista04.Pedido;

import java.util.Scanner;

public class Pedido {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Scanner scanfInt = new Scanner(System.in);
        Scanner scanfDouble = new Scanner(System.in);
        int quantidade = 0;
        int add = 0;
        do {
            System.out.println("Quantos produtos?");
            quantidade = scanf.nextInt();
        } while (quantidade < 1 || quantidade > 100);
        Produto produto[] = new Produto[quantidade];
        int opcao;
        do {
            System.out.println("Menu:" + add);
            System.out.println("1)add Frios");
            System.out.println("2)add Paozinho");
            System.out.println("3)add Doces");
            System.out.println("opcao de 1 - 4");
            opcao = scanf.nextInt();
            switch (opcao) {

                case 1:
                    if (quantidade > add) {
                        System.out.println("preco e quantidade(frios)");
                        produto[add] = new Frios(scanfDouble.nextDouble(), scanfInt.nextInt());
                        add++;
                    }
                    break;
                case 2:
                    if (quantidade > add) {
                        System.out.println("preco e quantidade(paozinho)");
                        produto[add] = new Paozinho(scanfDouble.nextDouble(), scanfInt.nextInt());
                        add++;
                    }
                    break;
                case 3:
                    if (quantidade > add) {
                        System.out.println("preco e quantidade(doces)");
                        produto[add] = new Doces(scanfDouble.nextDouble(), scanfInt.nextInt());
                        add++;
                    }
                    break;
                default:
                    System.out.println("Invalido Tente outro valor");
                    break;
            }
        } while ((quantidade != add));

        for (int i = 0; i < quantidade; i++) {
            if (produto[i] instanceof Frios) {
                System.out.println("[Frios]:");
            }
            if (produto[i] instanceof Doces) {
                System.out.println("[Doces]:");
            }
            if (produto[i] instanceof Paozinho) {
                System.out.println("[Paozinho]:");
            }

            System.out.println(produto[i]);
        }

        System.out.println("Pedidos totais:" + quantidade);

    }

}
