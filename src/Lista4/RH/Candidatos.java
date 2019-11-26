package Lista4.RH;

/**
 *
 * @author gabri
 */
public class Candidatos {

    private String nome;
    private int idade;

    public Candidatos() {
        nome = "asdasd";
        idade = 2;
    }

    public Candidatos(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "\t idade:" + idade;
    }

}
