package Ejercicio3;
import tp02.ejercicio2.*;
import Ejercicio1y2.ArbolBinario;

public class ContadorArbol {
    ArbolBinario<Integer> arbol = new ArbolBinario<>();
    
    public ListaEnlazadaGenerica<Integer> numerosParesPostorden(){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        if(arbol.tieneHijoIzquierdo())
            arbol.getHijoIzquierdo().numerosParesPostorden();
        if(arbol.tieneHijoDerecho())
            arbol.getHijoDerecho().numerosPares();
        if((arbol.getDato()%2)==0)
            lista.agregarFinal(arbol.getDato());
        return lista;
    }
    
    public ListaEnlazadaGenerica<Integer> numerosParesInorden(){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        if(arbol.tieneHijoIzquierdo())
            arbol.getHijoIzquierdo().numerosPares();
        if(arbol.tieneHijoDerecho())
            arbol.getHijoDerecho().numerosPares();
        if((arbol.getDato()%2)==0)
            lista.agregarFinal(arbol.getDato());
        return lista;
    }    
    
}
