package parcial2;
import PackDeCosas.*;
public class parcial{

    private void resolver(ListaEnlazadaGenerica<Integer> lista,ArbolBinario<Integer> a){
        
    }
    private int contarNodos(ArbolBinario<Integer> a){
        if ((a == null))
    }
    public ListaEnlazadaGenerica<Integer> resolver(ArbolBinario<Integer> arbol){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
        if ((arbol != null)&&(!arbol.esVacio()))
            this.resolver(lista,arbol);
        return lista;
    }
}
