package Lista04.Floresta;

import java.util.Scanner;

public class Floresta {

    public static void main(String[] args) {
        int opcao;
        int tamanho = 0;
        int cadastrar;
        int length = 0;
        Scanner scanf = new Scanner(System.in);
        Scanner scanfStr = new Scanner(System.in);
        Scanner scanfBol = new Scanner(System.in);

        do {
            Plantas plantas[] = new Plantas[length];
            System.out.println("MENU");
            System.out.println("1)Cadastrar plantas");
            System.out.println("2)Lista plantas");
            System.out.println("3)Mostrar quantidade de plantas na floresta");
            System.out.println("4)Mostrar quantidade de cada tipo(arvore,flor e carinvora)");
            System.out.println("5)Sair");
            opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    length++;
                    break;
                case 2:
                    if (length > tamanho) {
                        System.out.println("Qual Planta 1)Arvore,2)Flor,3)Carnivora");
                        cadastrar = scanf.nextInt();
                        if (cadastrar == 1) {
                            System.out.println("Fruteira(true/false),nome,especie");
                            plantas[tamanho] = new Arvore(scanfStr.nextBoolean(), scanf.nextLine(), scanf.nextLine());
                            tamanho++;
                        } else if (cadastrar == 2) {
                            System.out.println("Cor,Nome,Especie");
                            plantas[tamanho] = new Flor(scanfStr.nextLine(), scanfStr.nextLine(), scanfStr.nextLine());
                            tamanho++;
                        } else if (cadastrar == 3) {
                            System.out.println("Venenosa(true/false),nome,especie");
                            plantas[tamanho] = new Carnivora(scanfBol.nextBoolean(), scanfStr.nextLine(), scanfStr.nextLine());
                            tamanho++;
                        }
                    } else {

                        break;
                    }

                case 3:
                    System.out.println("contem:" + tamanho + " de plantas na floresta");
                    break;
                case 4:
                    for (int i = 0; i <= length; i++) {

                        if (plantas[i] instanceof Carnivora) {
                            System.out.println("[Carnivora]:");

                        }
                        if (plantas[i] instanceof Flor) {
                            System.out.println("[Flor]");
                        }
                        if (plantas[i] instanceof Arvore) {
                            System.out.println("[Arvore]");
                        }

                        System.out.println(plantas[i]);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Valor invalido");
            }
        } while (opcao != 5);
    }

}
