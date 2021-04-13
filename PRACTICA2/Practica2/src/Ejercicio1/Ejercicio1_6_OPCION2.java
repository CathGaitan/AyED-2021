package Ejercicio1;
import tp02.ejercicio1.*;
public class Ejercicio1_6_OPCION2 { //OPCION CON VARIABLE DEL METODO
    
    public ListaDeEnterosEnlazada calcularSucesion(int n){
       ListaDeEnterosEnlazada L=new ListaDeEnterosEnlazada();
       calcularSucesionAux(n,L);
       return L;
    }
    private void calcularSucesionAux(int n,ListaDeEnterosEnlazada L){
        if (n == 1){ //caso base
            L.agregarFinal(1);
        }else{
            if ((n%2)==0){ //ES PAR
                L.agregarFinal(n);
                calcularSucesionAux(n/2,L);
            }else{ //ES IMPAR
                L.agregarFinal(n);
                calcularSucesionAux(3*n+1,L);
            }
        }
    }

    public static void main (String[] args) {
        Ejercicio1_6 f = new Ejercicio1_6();
        ListaDeEnterosEnlazada L = f.calcularSucesion(20);
        L.comenzar();
        while (!L.fin()){
            System.out.println(L.proximo());
        }
        
    }

}
