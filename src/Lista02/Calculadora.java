package Lista02;

public class Calculadora {

    private int numero1;
    private int numero2;
    
    public Calculadora(){
        
    }
    public Calculadora(int numero1,int numero2) {
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int somar() {
        return getNumero1() + getNumero1();
    }

    public int subtrair() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        return numero1 / numero2;
    }

}
