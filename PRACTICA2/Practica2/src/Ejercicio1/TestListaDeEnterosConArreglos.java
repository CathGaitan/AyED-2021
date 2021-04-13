package Ejercicio1;
import tp02.ejercicio1.*;
public class TestListaDeEnterosConArreglos {
    public static void main(String[] args) {
        ListaDeEnteros lista = new ListaDeEnterosConArreglos(); //para el UPCASTING
        for(int i=0; i < args.length; i++){
            int num=Integer.valueOf(args[i]);
            lista.agregarFinal(num);
            System.out.println(lista.proximo());
        }
        System.out.println("----------------------");
        lista.comenzar();
        lista.imprimirRecursivo(lista);
    }
}
