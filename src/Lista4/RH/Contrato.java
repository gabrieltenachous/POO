package Lista4.RH;

public class Contrato extends Vagas {

    private boolean temporario;

    public Contrato(boolean temporario, String descricao, double salario) {
        super(descricao, salario);
        setTemporario(temporario);
    }

    @Override
    public String toString() {
        return super.toString() + "\t Temporario:" + temporario;
    }

    public boolean isTemporario() {
        return temporario;
    }

    public void setTemporario(boolean temporario) {
        this.temporario = temporario;
    }

}
