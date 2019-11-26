package Lista02;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private boolean fazAniversario;

    Pessoa() {

    }

    Pessoa(String nome, int idade, double altura) {
        this.fazAniversario=fazAniversario;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isFazAniversario() {
        return fazAniversario;
    }

    public void setFazAniversario(boolean fazAniversario) {
        this.fazAniversario = fazAniversario;
    }
}
