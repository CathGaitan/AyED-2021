package EjerciciosTeoricos;
import PackDeCosas.ArbolBinario;
public class Punto4 {
    public static void traverse(ArbolBinario x){
           System.out.println(x.getDato());
           if(x.tieneHijoIzquierdo())
               traverse(x.getHijoIzquierdo());
           if(x.tieneHijoDerecho())
               traverse(x.getHijoDerecho());
           System.out.println(x.getDato());
    }
    public static void main(String[] args) {
        //           C
        //         /   \
        //        A     E
        //         \   / \
        //          B D   F
        ArbolBinario<String> C =new ArbolBinario("C");
        ArbolBinario<String> A =new ArbolBinario("A");
        ArbolBinario<String> E =new ArbolBinario("E");
        ArbolBinario<String> B =new ArbolBinario("B");
        ArbolBinario<String> D =new ArbolBinario("D");
        ArbolBinario<String> F =new ArbolBinario("F");

        C.agregarHijoIzquierdo(A);
        C.agregarHijoDerecho(E);
        A.agregarHijoDerecho(B);
        E.agregarHijoIzquierdo(D);
        E.agregarHijoDerecho(F);
        traverse(C);
    }
}
