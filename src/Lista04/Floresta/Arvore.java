package Lista04.Floresta;

public class Arvore extends Plantas {

    private boolean frutifera;

    public Arvore(boolean frutifera, String nomes, String especie) {
        super(nomes, especie);
        setFrutifera(frutifera);
    }

    

    public boolean isFrutifera() {

        
        
        return frutifera;
    }

    public void setFrutifera(boolean frutifera) {
        this.frutifera = frutifera;
    }

    @Override
    public String toString() {
        return super.toString() + "   Frutifera:"+frutifera;
    }

}
