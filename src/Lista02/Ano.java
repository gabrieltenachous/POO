package Lista02;

public class Ano {

    private int ano;
    private boolean bissexto;

    Ano() {
    }

    //|| || || || || 
    Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;
    }

    public void exibirBissexto() {
        if (isBissexto() == true) {
            System.out.println("é bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }

}
