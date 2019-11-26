 
package Lista4.RH;

/**
 *
 * @author gabri
 */
public class Desempregados extends Candidatos{
    private int mesSemTrabalho;

    public Desempregados(int mesSemTrabalho, String nome, int idade) {
        super(nome, idade);
        setMesSemTrabalho(mesSemTrabalho);
    }

    
    
    /**
     * @return the mesSemTrabalho
     */
    public int getMesSemTrabalho() {
        return mesSemTrabalho;
    }

    /**
     * @param mesSemTrabalho the mesSemTrabalho to set
     */
    public void setMesSemTrabalho(int mesSemTrabalho) {
        this.mesSemTrabalho = mesSemTrabalho;
    }

    @Override
    public String toString() {
        return super.toString()+"\t Meses sem trabalho"+mesSemTrabalho; 
    }
    
}
