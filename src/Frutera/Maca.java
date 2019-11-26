
package Frutera;

public class Maca extends Fruta{
    private String sabor;

    public Maca() {
        sabor="azedo";
    }
    
    
    public Maca(String cor) {
        super(cor);
        setSabor(sabor);
    }

    public String getSabor() {
        return sabor;
    }

     
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        String s="Maca:"; 
        s+=super.toString()+"[Sabor:"+sabor+"]";
        return s;
    }
    
    
}
