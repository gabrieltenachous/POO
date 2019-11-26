package poo;

public class Ex09 {

    public static void main(String[] args) {
        System.out.println(dado());
    }

    private static int dado() {
       return (int) (Math.random() * (5)+1);
        
    }

}
