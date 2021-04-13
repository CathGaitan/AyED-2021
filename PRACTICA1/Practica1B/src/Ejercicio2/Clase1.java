package Ejercicio2;
public class Clase1 {
    int [] vector;
    
    public int[] devolverVector(int n){
        vector = new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            vector[i]=n+x;
            x+=n;
        }
        return vector;
    }

}
