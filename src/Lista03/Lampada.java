package Lista03;

public class Lampada {

    private String marca;
    private String modelo;
    private String tipo;
    private boolean lampada;

    public Lampada() {
        marca = "Sem val";
        modelo = "sem val";
        tipo = "sem val";
        lampada=false;
    }

    public Lampada(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarEstado() {
        if(isLampada()==true){
            System.out.println("Acesa");
        }else{
            System.out.println("Desligada");
        }
    }

    /**
     * @return the lampada
     */
    public boolean isLampada() {
        return lampada;
    }

    /**
     * @param lampada the lampada to set
     */
    public void setLampada(boolean lampada) { 
        this.lampada = lampada;

    }
}
