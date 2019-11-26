package poo;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("digite o n1 ");
        int n1=scanf.nextInt();
        System.out.println("digite o n2");
        int n2=scanf.nextInt();
        int total = maior(n1,n2);
        System.out.println(total);
    }
    
    public static int maior(int n1, int n2) {
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
        
    }
}
