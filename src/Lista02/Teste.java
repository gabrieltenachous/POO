package Lista02;
public class Teste {

    public static void main(String[] args) {
        int numero=125;
        int i=0;
        while (numero > 0) {
            
            i *= 10;
            i += (numero % 10);
            System.out.println(i);
            numero /= 10;
            
        }
    }

}
