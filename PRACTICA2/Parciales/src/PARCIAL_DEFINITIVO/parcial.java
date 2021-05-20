package PARCIAL_DEFINITIVO;
import PackDeCosas.*;
public class parcial {
    public void colorearArbol (ArbolBinario<String> arbol, Integer maxColor){
        int contnivel=0,cont=0;
        ColaGenerica <ArbolBinario<String>> cola = new ColaGenerica<>();
        ArbolBinario <String> a=null;
        cola.encolar(arbol);
        cola.encolar(null);
        while(!cola.esVacia()){
            a=cola.desencolar();
            if(a != null){
                if((esPar(contnivel))&&(cont < maxColor)){
                    a.setDato("Negro");
                    cont++;
                }else{
                    if(cont >= maxColor){
                        a.setDato("Verde");
                    }          
                }
                 if((!esPar(contnivel))&&(cont < maxColor)){
                    a.setDato("Rojo");
                    cont++;
                }else{
                    if(cont > maxColor){
                        a.setDato("Verde");
                    }
                }  
                if(a.tieneHijoIzquierdo())
                    cola.encolar(a.getHijoIzquierdo());
                if(a.tieneHijoDerecho())
                    cola.encolar(a.getHijoDerecho());
            }else if (!cola.esVacia()){
                contnivel++;
                cont=0;
                cola.encolar(null);
            }
            arbol=a;
        }
    }

    private boolean esPar(int num){
        return (num % 2)==0;
    }
        public static void main(String[] args) {
        ArbolBinario<String> a1 = new ArbolBinario<>();
        ArbolBinario<String> a2 = new ArbolBinario<>();
        ArbolBinario<String> a3 = new ArbolBinario<>();
        ArbolBinario<String> a4 = new ArbolBinario<>();
        ArbolBinario<String> a5 = new ArbolBinario<>();
        ArbolBinario<String> a6 = new ArbolBinario<>();
        ArbolBinario<String> a7 = new ArbolBinario<>();
        ArbolBinario<String> a8 = new ArbolBinario<>();
        ArbolBinario<String> a9 = new ArbolBinario<>();
        ArbolBinario<String> a10 = new ArbolBinario<>();
        ArbolBinario<String> a11 = new ArbolBinario<>();

        a1.agregarHijoIzquierdo(a2);
        a1.agregarHijoDerecho(a3);
        a2.agregarHijoIzquierdo(a4);
        a2.agregarHijoDerecho(a5);
        a5.agregarHijoDerecho(a8);
        a3.agregarHijoIzquierdo(a6);
        a3.agregarHijoDerecho(a7);
        a6.agregarHijoIzquierdo(a9);
        a7.agregarHijoIzquierdo(a10);
        a7.agregarHijoDerecho(a11);

        parcial color = new parcial();
        color.colorearArbol(a1,3);
        a1.printPorNiveles();
    }
}
