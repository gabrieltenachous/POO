package Lista4.RH;

import java.util.Scanner;

public class RH {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Scanner scanf2 = new Scanner(System.in);

        int opcao;
        int escolha;
        int quantidade = 1;
        int numeroCandidato = 0;
        Candidatos candidato[] = new Candidatos[quantidade];
        do {

            System.out.println("1) Cadastrar Candidatos");
            System.out.println("2) Cadastrar Vagas");
            System.out.println("3) Cadastrar Candidatos x Vagas");
            System.out.println("4) Listar Vagas Por Tipo");
            System.out.println("5) Mostrar quantidade de Candidatos(e sua situação)");
            System.out.println("6) Mostrar quantidade de Candidatos x Vagas");
            opcao = scanf.nextInt();

        } while ((opcao <= 1) && (opcao >= 6));

        switch (opcao) {
            case 1:

                System.out.println("Candidado 1) Empregado ou 2) Desempregado?");
                escolha = scanf.nextInt();
                if (escolha == 1) {
                    System.out.println("Nome da empresa / Nome / Idade");
                    quantidade++;
                    candidato[numeroCandidato++] = new Empregados(scanf.nextLine(), scanf.nextLine(), scanf.nextInt());
                } else if (escolha == 2) {
                    System.out.println("Mes sem trabalhar / Nome / Idade");
                    quantidade++;
                    candidato[numeroCandidato++] = new Desempregados(scanf.nextInt(), scanf.nextLine(), scanf.nextInt());
                }

                break;
        }

    }
}