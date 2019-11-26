
package Lista04.Floresta;

public class Flor extends Plantas{
    private String cor;

    public Flor(String cor, String nomes, String especie) {
        super(nomes, especie);
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    } 
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString()+"  cor:"+cor;  
    }
    
}
