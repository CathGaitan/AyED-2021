package Ejercicio4;
import PackDeCosas.ArbolBinario;
public class RedBinariaLlena {
    private static ArbolBinario<Integer> arbol = new ArbolBinario<>();
    
//           14
//         /    \
//        53     2
//       / \    / \
//      12  9  33 102
/*Para pensar este problema recursivamente podriamos pensar que tenemos una funcion
  magica que nos calcula automaticamente el retardo de envio maximo del HD y el HI de mi raiz
  (en este caso mi raiz es 14) entonces si lo pensamos de esta forma el codigo quedaria:

    public static int retardoReenvio(ArbolBinario <Integer> arbol){
        int HI,HD,max;
        if (arbol.esHoja()){
            return arbol.getDato();
        }else{
            HI=FuncionMagica(arbol.getHijoIzquierdo());
            HD=FuncionMagica(arbol.getHijoDerecho());
            max=Math.max(HI,HD);
            return max+arbol.getDato();
        }
    } 
    Asi de esta forma la funcionMagica(HI) nos devolveria 65 y
    la FuncionMagica(HD) nos devolveria 104
    Entonces hacemos max(65,104) y obvio nos quedamos que 104 es mayor.
    Entonces retornamos 104+14=118 que es el retardoDeEnvio.
    Pero si este metodo sirve para un arbol, porque no podria servir para
    mis hijos, que son arboles pero mas chiquitos?
    Entonces yo en vez de poner FuncionMagica llamo recursivamente a retardoReenvio
    ya que si funciona con un arbol, tiene que funcionar con todos.
*/ 

    public void setArbol(ArbolBinario<Integer> arbol) {
        RedBinariaLlena.arbol = arbol;
    }

    public static ArbolBinario<Integer> getArbol() {
        return arbol;
    }
    
    public static int retardoReenvio(ArbolBinario <Integer> arbol){
        int HI,HD,max;
        if (arbol.esHoja()){
            return arbol.getDato();
        }else{
            HI=retardoReenvio(arbol.getHijoIzquierdo());
            HD=retardoReenvio(arbol.getHijoDerecho());
            max=Math.max(HI,HD);
            return max+arbol.getDato();
        }
    }

// METODO SIN RECIBIR PARAMETROS
//    public static int retardoReenvio(){
//        int HI,HD,max;
//        if (arbol.esHoja()){
//            return arbol.getDato();
//        }else{
//            HI=;
//            HD=;
//            max=Math.max(HI,HD);
//            return max+arbol.getDato();
//        }
//    }   
}


