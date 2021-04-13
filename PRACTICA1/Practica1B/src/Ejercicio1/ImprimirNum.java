package Ejercicio1;
public class ImprimirNum {

    public void imprimirFor (int a, int b){
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
    public void imprimirWhile (int a,int b){
        int i=a;
        while (i<=b){
            System.out.println(i);
            i++;
        }
    }
    public int imprimirSinNada(int a,int b){
        if (a == b){ //CASO BASE
            System.out.println(a);
            return a;
        }
        else{
            System.out.println(a);
            return imprimirSinNada(a+1,b); //llamo con a incrementado hasta que
                                           // a y b sean iguales
        }
    }
    
    public void recursivo(int a,int b){
        System.out.println(a);
        if (a < b){
            recursivo(a+1,b);
        }
    }
}
