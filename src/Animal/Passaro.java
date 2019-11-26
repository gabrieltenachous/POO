package Animal;

public class Passaro extends Animal {

    private String corPena;

    public Passaro() {
        setIdade(2);
        setNome("Jonas");
        setEspecie("Arara");
        corPena = "Amarelo";
    }

    public Passaro(String corPena, String nome, String especie, int idade) {
        super(nome, especie, idade);
        this.corPena = corPena;
    }

    
    @Override
    public String toString() {
        String s="Passaro=[";
        s+="Cor da pena:"+getCorPena();
        s+="nome:"+getNome();
        s+="idade:"+getIdade();
        s+="especie:"+getEspecie()+"]";
        return s;
    }

    /**
     * @return the corPena
     */
    public String getCorPena() {
        return corPena;
    }

    /**
     * @param corPena the corPena to set
     */
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
