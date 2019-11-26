package Lista02;

public class Primo {

    private int primo;
    private boolean ehPrimo;

    public Primo() {
    }

    public Primo(int primo) {
        this.primo = primo;
    }

    public void setPrimo(int primo) {
        this.primo = primo;
    }

    public int getPrimo() {
        return primo;
    }

    public boolean isEhPrimo() {
        int contador = 0;
        for (int i = 1; i <= primo; i++) {
            if(primo%i==0){
                contador++;
            }
        }
        return contador==2;
    }
    void mostrarPrimo(){
        if(isEhPrimo()){
            System.out.println("é primo");
        }else{
            System.out.println("não é primo");
        }
    }
}
