
package Lista4.RH;

public class Estagio extends Vagas{
    private int tempoMes;

    public Estagio(int tempoMes, String descricao, double salario) {
        super(descricao, salario);
        setTempoMes(tempoMes);
    }

    @Override
    public String toString() {
        return super.toString()+"\t Tempo de Estagio"+tempoMes;
    }

 
    public int getTempoMes() {
        return tempoMes;
    }

    public void setTempoMes(int tempoMes) {
        this.tempoMes = tempoMes;
    }
    
}
