package Ejercicio3;
import PackDeCosas.*;
public class ContadorArbol {
    private ArbolBinario<Integer> arbol = new ArbolBinario<>();
    
    private ListaEnlazadaGenerica<Integer> paresPostOrden(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista){
        if(arbol.tieneHijoIzquierdo()){
            paresPostOrden(arbol.getHijoIzquierdo(),lista);
        }
        if(arbol.tieneHijoDerecho()){
            paresPostOrden(arbol.getHijoDerecho(),lista);
        }
        if((arbol.getDato()%2)==0){
            lista.agregarFinal(arbol.getDato());
        }
        return lista;
    }
    
    private ListaEnlazadaGenerica<Integer> paresInOrden(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista){
        if(arbol.tieneHijoIzquierdo())
            paresInOrden(arbol.getHijoIzquierdo(),lista);
        if(arbol.tieneHijoDerecho())
            paresInOrden(arbol.getHijoDerecho(),lista);
        if((arbol.getDato()%2)==0)
            lista.agregarFinal(arbol.getDato());
        return lista;
    }

    public ListaEnlazadaGenerica<Integer> numerosParesPostorden(){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        this.paresPostOrden(arbol,lista);
        return lista;
    }
    
    public ListaEnlazadaGenerica<Integer> numerosParesInOrden(){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        this.paresInOrden(arbol,lista);
        return lista;
    }
}
