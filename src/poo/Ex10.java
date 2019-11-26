package poo;

public class Ex10 {

    public static void main(String[] args) {
        int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
        for(int i=0;i<1000;i++){
        int valor=random();
        if(valor==1){
            n1++;
        }else if(valor==2){
            n2++;
        }
        else if(valor==3){
            n3++;
        }
        else if(valor==4){
            n4++;
        }
        else if(valor==5){
            n5++;
        }
        else{
            n6++;
        }
        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }

    public static int random() {
        return 1+ (int) (6 * Math.random());
    }

}
