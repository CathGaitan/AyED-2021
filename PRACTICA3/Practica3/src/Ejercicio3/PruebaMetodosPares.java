package Ejercicio3;
import PackDeCosas.*;
public class PruebaMetodosPares {
    public static void main(String[] args) {
        //          14
        //         /  \
        //        53   2
        //       /    / \
        //      12   33 102
        ArbolBinario<Integer> catorce =new ArbolBinario(14);
        ArbolBinario<Integer> cincuentaYTres =new ArbolBinario(53);
        ArbolBinario<Integer> dos =new ArbolBinario(2);
        ArbolBinario<Integer> doce =new ArbolBinario(12);
        ArbolBinario<Integer> treintaYTres =new ArbolBinario(33);
        ArbolBinario<Integer> cientoDos =new ArbolBinario(102);
        
        catorce.agregarHijoIzquierdo(cincuentaYTres);
        catorce.agregarHijoDerecho(dos);
        cincuentaYTres.agregarHijoIzquierdo(doce);
        dos.agregarHijoIzquierdo(treintaYTres);
        dos.agregarHijoDerecho(cientoDos);
        
        System.out.println("---PARES DEL POSTORDEN---");
        ContadorArbol cont = new ContadorArbol();
        ListaEnlazadaGenerica<Integer> lista =cont.numerosParesPostorden(catorce);
        lista.comenzar();
        while(!lista.fin()){
            System.out.println(lista.proximo());
        }
        
        System.out.println("---PARES DEL INORDEN---");
        ListaEnlazadaGenerica<Integer> lista2 =cont.numerosParesInOrden(catorce);
        lista2.comenzar();
        while(!lista2.fin()){
            System.out.println(lista2.proximo());
        }

    }
}
