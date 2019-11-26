/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4.RH;

/**
 *
 * @author gabri
 */
public class Empregados extends Candidatos {

    private String nomes;

    public Empregados(String nomes, String nome, int idade) {
        super(nome, idade);
        this.nomes = nomes;
    }

    

    /**
     * @return the nomeEmpresa
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * @param nomes
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Nome da Empresa:" + nomes;
    }

}
