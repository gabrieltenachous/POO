
package Frutera;

public class Banana extends Fruta{
    private String tipo;

    public Banana() {
        super.cor="amarela";
        tipo="prata";
    }

    public  Banana(String cor) {
        super(cor);
        setTipo(tipo);
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String s="Banana:";
        s+=super.toString()+"[Sabor:"+tipo+"]";
        return s;
    }
    
}
