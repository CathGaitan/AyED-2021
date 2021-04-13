package Ejercicio1;
import tp02.ejercicio1.*;
public class TestListaDeEnterosEnlazada {
    public static void main(String[] args) {
        ListaDeEnteros lista = new ListaDeEnterosEnlazada(); //para el UPCASTING
        lista.comenzar(); //hago que actual apunte a mi primer elemento
        for(int i=0; i < args.length; i++){
            int num=Integer.valueOf(args[i]); //convierto String en integer
            lista.agregarFinal(num);
        }
        lista.comenzar();//tengo que poner el puntero en el inicio de nuevo
        while (!lista.fin()){ //mientras la lista no termine
            System.out.println(lista.proximo());//imprimo el siguiente
        }
        System.out.println("--------------------------");
        lista.imprimirRecursivo(lista);
    }
}
