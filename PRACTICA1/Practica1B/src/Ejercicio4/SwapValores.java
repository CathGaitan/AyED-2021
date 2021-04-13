package Ejercicio4;
public class SwapValores {
    public static void swap1 (int x, int y) {
        if (x < y){ //(1<2)
            int tmp=x;//tmp=1;
            x=y;//x=2;
            y=tmp;//y=1;
        }
    } 

    public static void swap2 (Integer x, Integer y) {
        if (x < y) { //3<4
            int tmp=x; // tmp=3
            x=y; // x=4
            y=tmp; //y=3
        }
    }

    public static void main(String[] args) {
        int a=1,b=2; 
        Integer c=3,d=4;
        swap1(a,b); 
        swap2(c,d);
        System.out.println("a=" + a + " b=" + b);
        System.out.println("c=" + c + " d=" + d);
    }
}

//Ejercicio A: Imprime a=1 b=2 c=3 d=4 Debido a que los parametros son enviados por valor y los wrappes son inmutables
//Ejercicio B: Imprime a=1 b=2 c=3 d=4
//Ejercicio C: En el swap1 al terminarlo se ve que x=2,y=1
//             En el swap2 al terminarlo se ve que x=3,y=4
//             
