package Lista03;

public class ConversaoDeUnidadesDeArea {

    private double metroQuadrado;
    private double peQuadrado;
    private double milhaQuadrado;
    private double acre;

    public ConversaoDeUnidadesDeArea() {
    }

    public ConversaoDeUnidadesDeArea(double metroQuadrado, double peQuadrado, double milhaQuadrado, double acre) {
        setAcre(acre);
        setPeQuadrado(peQuadrado);
        setMetroQuadrado(metroQuadrado);
        setMilhaQuadrado(milhaQuadrado);
    }

   

    public double getMetroQuadrado() {
        
        return metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        metroQuadrado = peQuadrado * 10.76;
        this.metroQuadrado = metroQuadrado;
    }

    public double getPeQuadrado() {
        return peQuadrado;
    }

    public void setPeQuadrado(double peQuadrado) {
        
        this.peQuadrado = peQuadrado;
    }

    public double getMilhaQuadrado() {
        return milhaQuadrado;
    }

    public void setMilhaQuadrado(double milhaQuadrado) {
            milhaQuadrado = peQuadrado * 929;
        this.milhaQuadrado = milhaQuadrado;
    }

    public double getAcre() {
        return acre;
    }

    public void setAcre(double acre) {
        this.acre = acre;
    }
}
