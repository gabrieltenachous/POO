package Lista03;

public class Restaurante {

    private double conta;
    private int pessoas;
    private boolean garcom;

    public Restaurante() {
        garcom = false;
        conta = 0;
        pessoas = 0;
    }

    public Restaurante(double conta, int pessoas, boolean garcom) {
        this.conta = conta;
        this.pessoas = pessoas;
        this.garcom = garcom;
    }

    public double dividirConta() {
        if (garcom == true) {
            return conta / pessoas + (conta / pessoas * 0.1);
        } else {
            return conta / pessoas;
        }
    }

    /**
     * @return the conta
     */
    public double getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(double conta) {
        this.conta = conta;
    }

    /**
     * @return the pessoas
     */
    public int getPessoas() {

        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(int pessoas) {
        if (100 >= pessoas) {

            this.pessoas = pessoas;
        }

    }

    /**
     * @return the garcom
     */
    public boolean isGarcom() {

        return garcom;
    }

    /**
     * @param garcom the garcom to set
     */
    public void setGarcom(boolean garcom) {
        this.garcom = garcom;
    }

}
