package Lista02;

public class Numero {

    private int numero;

    /**
     * @return the 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the  to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    int inverterNumero() {
        int i = 0;
        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;
        }

        return i;
    }
    
    void mostrarNumero(){
        
    }

}
