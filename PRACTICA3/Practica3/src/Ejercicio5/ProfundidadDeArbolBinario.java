package Ejercicio5;
import PackDeCosas.*;

public class ProfundidadDeArbolBinario {
    public ArbolBinario<Integer> arbol;

    public void setArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }
    
    
    //VERSION QUE CUANDO ENCUENTRA ESE NIVEL NO SIGUE CON LOS OTROS NIVELES
    public int sumaElementosProfundidad(int p){
        ColaGenerica <ArbolBinario<Integer>> cola = new ColaGenerica<>();
        ArbolBinario <Integer> arbolito;
        int contNivel=0,suma=0;
        cola.encolar(arbol);
        cola.encolar(null);
        if (p <= arbol.altura()){
            while(!cola.esVacia()){
                arbolito=cola.desencolar();
                if(arbolito != null){
                    if (contNivel == p){
                        while(arbolito != null){
                            suma+=arbolito.getDato();
                            arbolito=cola.desencolar();
                        }
                    } else{
                        if(arbolito.tieneHijoIzquierdo())
                            cola.encolar(arbolito.getHijoIzquierdo());
                        if(arbolito.tieneHijoDerecho())
                            cola.encolar(arbolito.getHijoDerecho()); 
                    }
                }else if (!cola.esVacia()){
                    contNivel++;
                    cola.encolar(null);
                }
            }           
            return suma;
        } else return -1;
    }
}

//VERSION QUE RECORRE TODO EL ARBOL A PESAR DE HABER ENCONTRADO EL NIVEL
//        public int sumaElementosProfundidad(int p){
//        ColaGenerica <ArbolBinario<Integer>> cola = new ColaGenerica<>();
//        ArbolBinario <Integer> arbolito;
//        int contNivel=0,suma=0;
//        cola.encolar(arbol);
//        cola.encolar(null);
//        if (p <= arbol.altura()){
//            while(!cola.esVacia()){
//                arbolito=cola.desencolar();
//                if(arbolito != null){
//                    if (contNivel == p)
//                      suma+=arbolito.getDato();
//                    if(arbolito.tieneHijoIzquierdo())
//                      cola.encolar(arbolito.getHijoIzquierdo());
//                    if(arbolito.tieneHijoDerecho())
//                      cola.encolar(arbolito.getHijoDerecho()); 
//                }else if (!cola.esVacia()){
//                    contNivel++;
//                    cola.encolar(null);
//                }
//            }           
//            return suma;
//        } else return -1;
//    }