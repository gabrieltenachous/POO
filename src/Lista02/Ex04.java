package Lista02;
import java.util.Scanner;
public class Ex04 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Numero numero = new Numero();
        
        
        numero.setNumero(scanf.nextInt());
        System.out.println(numero.getNumero());
        System.out.println(numero.inverterNumero());
        
    }

}
