
package Animal;

public class Animal {
    private String nome,especie;
    private int idade;

    public Animal() {
        idade = 12;
        nome="Spaik";
        especie="Pitubul";
    }

    @Override
    public String toString() {
        String s = "Animal[";
        s+=" Idade:"+idade ;
        s+=" Noma:"+nome;
        s+=" Especie:"+especie+"]";
        return s;
    }
    
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
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
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
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

    
    
    
}
