package parcial1;
import PackDeCosas.ArbolBinario;
public class BuscadorDeArbol {
    private ArbolBinario<Integer> arbol;
    private int dato=-1;
    private int nivel=0;
    
    BuscadorDeArbol(ArbolBinario<Integer> arbol){ //constructor
        this.arbol=arbol;
    }
    
    public Integer buscar(){
        if ((arbol != null)&&(!arbol.esVacio()))
            this.buscar(arbol,0);
        return dato;
    }
    private Integer buscar(ArbolBinario<Integer> a,int nivelAct){
        if(a.esHoja()){
            if(nivel < nivelAct){
                nivel=nivelAct;
                dato=a.getDato();
                System.out.println(dato);
            }
        }
        if(a.tieneHijoIzquierdo())
            buscar(a.getHijoIzquierdo(),nivelAct++);
        if(a.tieneHijoDerecho())
            buscar(a.getHijoDerecho(),nivelAct++);
        return dato;
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

        a1.agregarHijoIzquierdo(a2);
        a1.agregarHijoDerecho(a3);
        a2.agregarHijoIzquierdo(a4);
        a2.agregarHijoDerecho(a5);
        a3.agregarHijoDerecho(a6);
        a5.agregarHijoIzquierdo(a7);
        a5.agregarHijoDerecho(a8);
        a6.agregarHijoIzquierdo(a9);

        System.out.println("Resultado: " + new BuscadorDeArbol(a1).buscar());
    }
    
}
