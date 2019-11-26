package Lista03;

public class Equacao {

    private int a;
    private int b;
    private int c;

    public Equacao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    public double delta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double bhaskara() {
        if (delta() < 0) {
            System.out.println("Nao existe raiz");
            return delta();
        } else {
            System.out.println(delta());
            System.out.println((-b-Math.sqrt(delta()))/2*a);
            return (-b+Math.sqrt(delta()))/2*a;
        }
       
    }
}