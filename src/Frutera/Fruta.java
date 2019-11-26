
package Frutera;

public class Fruta {
    String cor;

    public Fruta() {
        cor="vermelho";
    }
    
    
    public  Fruta(String cor) {
        setCor(cor);
    }
    
    public String getCor() {
        return cor;
    }

     
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[Cor:"+cor+"]\t";
    }
    
}
