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
public  class Vagas {
    private String descricao;
    private double salario;

    public Vagas(String descricao, double salario) {
        setDescricao(descricao);
        setSalario(salario);
    }

    @Override
    public String toString() {
        return "Descricao:"+descricao+"\t Salario:"+salario; 
    }
     

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
