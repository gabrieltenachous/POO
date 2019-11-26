package Lista02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        //Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
        //Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
        Scanner scanf = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite seu nome");
        pessoa.setNome(scanf.nextLine());
        System.out.println("Digite seu idade");
        pessoa.setIdade(scanf.nextInt());
        System.out.println("Digite seu altura");
        pessoa.setAltura(scanf.nextDouble());

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }

}
