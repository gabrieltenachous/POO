
package Lista04.Floresta;

public class Carnivora extends Plantas{
    private boolean venenosa;

    public Carnivora(boolean venenosa, String nomes, String especie) {
        super(nomes, especie);
        this.venenosa = venenosa;
    }
    
    public boolean isVenenosa() {
        return venenosa;
    } 
    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public String toString() {
        return super.toString()+"  venenoso:"+venenosa;  
    }
    
}
