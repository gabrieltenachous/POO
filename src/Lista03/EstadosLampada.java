package Lista03;

public class EstadosLampada {

    private boolean ligado;
    private boolean meialuz;

    public EstadosLampada() {
        meialuz = false;
        ligado = false;
    }

    
    public boolean isLigado() {
        return ligado;
    }

    
    public void setLigado(boolean ligado) {
            this.ligado = ligado;
            meialuz=false;
    }

    public void estadoLampada() {
        if (ligado) {
            System.out.println("ligado");
        } else if (meialuz) {
            System.out.println("meia luz");
        } else {
            System.out.println("desligado");
        }
    }

    public boolean isMeialuz() {
        return meialuz;
    }

    public void setMeialuz(boolean meialuz) {
            this.meialuz = meialuz;
            ligado=false;
    }
}
