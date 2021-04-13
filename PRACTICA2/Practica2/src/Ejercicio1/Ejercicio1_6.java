package Ejercicio1;
import tp02.ejercicio1.*;
public class Ejercicio1_6 { //OPCION CON VARIABLE DEL METODO
    private ListaDeEnterosEnlazada L=new ListaDeEnterosEnlazada();
    public ListaDeEnterosEnlazada calcularSucesion(int n){
        if (n == 1){ //caso base
            L.agregarFinal(1);
        }else{
            if ((n%2)==0){ //ES PAR
                L.agregarFinal(n);
                calcularSucesion(n/2);
            }else{ //ES IMPAR
                L.agregarFinal(n);
                calcularSucesion(3*n+1);
            }
        }
        return L;
    }

    public static void main (String[] args) {
        Ejercicio1_6 f = new Ejercicio1_6();
        ListaDeEnterosEnlazada L = f.calcularSucesion(6);
        L.comenzar();
        while (!L.fin()){
            System.out.println(L.proximo());
        }
        
    }

}
