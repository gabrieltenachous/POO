package Lista03;

public class ModeloComputador {

    private double placaMae;
    private double processadores;
    private double memoria;
    private String discoRigido;
    private int monitor;

   
    public ModeloComputador(double processadores, double memoria, String discoRigido, int monitor) {
        placaMae = 800;
        setProcessadores(processadores);
        setMemoria(memoria);
        setDiscoRigido(discoRigido);
        setMonitor(monitor);
    }

    public double getProcessadores() {
        return processadores;
    }

    public double calcularPreco() {
        int converteDisco;
        
        converteDisco = Integer.parseInt(discoRigido);
        
        return processadores + memoria + placaMae + converteDisco + monitor;
    }

    public void setProcessadores(double processadores) {

        if (processadores == 1600) {
            processadores = 700;
        } else if (processadores == 1800) {
            processadores = 830;
        } else if (processadores == 1900) {
            processadores = 910;
        }
        this.processadores = processadores;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        if (memoria == 1) {
            memoria = 350;
        }else if(memoria==2){
            memoria=700;
        }else if(memoria==4){
            memoria=1050;
        }else if(memoria==6){
            memoria=1400;
        }else if(memoria==8){
            memoria=1750;
        }
        this.memoria = memoria;
    }

    public double getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(double placaMae) {
        this.placaMae = placaMae;
    }

    public String getDiscoRigido() {
        return discoRigido;
    }

    public void setDiscoRigido(String discoRigido) {
        if ("500".equals(discoRigido)) {
            discoRigido = "300";

        } else if (discoRigido.equalsIgnoreCase("1TB")) {
            discoRigido = "420";
        } else if (discoRigido.equalsIgnoreCase("2TB")) {
            discoRigido = "500";
        }else{
            discoRigido="0";
        }
        this.discoRigido = discoRigido;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        if (monitor == 15) {
            monitor = 320;
        } else if (monitor == 17) {
            monitor = 520;
        }
        this.monitor = monitor;
    }

}
