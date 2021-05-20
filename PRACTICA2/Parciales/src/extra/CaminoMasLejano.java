package extra;
import PackDeCosas.*;
public class CaminoMasLejano {
    private ArbolBinario<Integer> arbol;

    public CaminoMasLejano(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }
    
    private int altura(ArbolBinario<Integer> arbol) {
        if (arbol == null) {
            return  -1;
        }
        else{
            return arbol.altura();
        }
    }
    
    public ListaEnlazadaGenerica<Integer> masLejano() {
        ListaEnlazadaGenerica<Integer> lista=new ListaEnlazadaGenerica<>();
        if ((arbol != null)&&(!arbol.esVacio())) {
                this.masLejano(arbol,lista);
        }
        return lista;
    }

    private void masLejano(ArbolBinario<Integer> a,ListaEnlazadaGenerica<Integer> lis) {
        if (a.esHoja()) {
            lis.agregarFinal(a.getDato());
        }
        else {
            if (altura(a.getHijoIzquierdo()) >= altura(a.getHijoDerecho())) {
                lis.agregarFinal(a.getDato());
                masLejano(a.getHijoIzquierdo(),lis);
            }
            else{
                lis.agregarFinal(a.getDato());
                masLejano(a.getHijoDerecho(),lis);
            }
        }
    }
    public static void main(String[] args) {
        ArbolBinario<Integer> a1 = new ArbolBinario<>(20);
        ArbolBinario<Integer> a2 = new ArbolBinario<>(7);
        ArbolBinario<Integer> a3 = new ArbolBinario<>(15);
        ArbolBinario<Integer> a4 = new ArbolBinario<>(12);
        ArbolBinario<Integer> a5 = new ArbolBinario<>(6);
        ArbolBinario<Integer> a6 = new ArbolBinario<>(10);
        ArbolBinario<Integer> a7 = new ArbolBinario<>(13);
        ArbolBinario<Integer> a8 = new ArbolBinario<>(11);
        ArbolBinario<Integer> a9 = new ArbolBinario<>(40);
        ArbolBinario<Integer> a10= new ArbolBinario<>(55);

        a1.agregarHijoIzquierdo(a2);
        a1.agregarHijoDerecho(a3);
        a2.agregarHijoIzquierdo(a4);
        a2.agregarHijoDerecho(a5);
        a3.agregarHijoDerecho(a6);
        a5.agregarHijoIzquierdo(a7);
        a5.agregarHijoDerecho(a8);
        a6.agregarHijoIzquierdo(a9);
        a8.agregarHijoDerecho(a10);

        ListaEnlazadaGenerica<Integer> lista = new CaminoMasLejano(a1).masLejano();
        lista.comenzar();
        while(!lista.fin()){
            System.out.println(lista.proximo());
        }
    }
}
