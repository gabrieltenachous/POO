package Lista04.Floresta;

public class Plantas {

    private String nomes;
    private String especie;

    public Plantas(String nomes, String especie) {
        setNomes(nomes);
        setEspecie(especie);
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nome:"+nomes+"  Especie:"+especie;
    }
    
}
