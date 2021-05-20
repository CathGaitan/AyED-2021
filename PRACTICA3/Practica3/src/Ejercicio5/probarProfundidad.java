package Ejercicio5;
import PackDeCosas.ArbolBinario;
public class probarProfundidad {
    public static void main(String[] args) {
        //           14
        //         /    \
        //        53     2
        //       / \    / \
        //      12  9  33 102
        ArbolBinario<Integer> catorce =new ArbolBinario(14);
        ArbolBinario<Integer> cincuentaYTres =new ArbolBinario(53);
        ArbolBinario<Integer> dos =new ArbolBinario(2);
        ArbolBinario<Integer> doce =new ArbolBinario(12);
        ArbolBinario<Integer> nueve = new ArbolBinario(9);
        ArbolBinario<Integer> treintaYTres =new ArbolBinario(33);
        ArbolBinario<Integer> cientoDos =new ArbolBinario(102);    
        
        catorce.agregarHijoIzquierdo(cincuentaYTres);
        catorce.agregarHijoDerecho(dos);
        cincuentaYTres.agregarHijoIzquierdo(doce);
        cincuentaYTres.agregarHijoDerecho(nueve);
        dos.agregarHijoIzquierdo(treintaYTres);
        dos.agregarHijoDerecho(cientoDos);
        
        ProfundidadDeArbolBinario prof = new ProfundidadDeArbolBinario();
        prof.setArbol(catorce);
        System.out.println("La suma del nivel 0 es: "+prof.sumaElementosProfundidad(0));
        System.out.println("La suma del nivel 1 es: "+prof.sumaElementosProfundidad(1));
        System.out.println("La suma del nivel 2 es: "+prof.sumaElementosProfundidad(2));
        System.out.println("La suma del nivel 3 es: "+prof.sumaElementosProfundidad(3));
    }
}

