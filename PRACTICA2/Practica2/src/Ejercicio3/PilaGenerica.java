package Ejercicio3;
import tp02.ejercicio2.*;
public class PilaGenerica<T>{
    private ListaGenerica<T> pila;
    public PilaGenerica(ListaGenerica<T> tipoDeLista){ //CONSTRUCTOR
        this.pila=tipoDeLista;
    }
    
    public void apilar(T elem){ //Agrega elem a la pila
        pila.agregarFinal(elem);
    }
    public T desapilar(){
        if (!esVacia()){
            T elem=tope();
            pila.eliminarEn(pila.tamanio());
            return elem;
        }else{
            return null;
        }
    }
    public T tope(){
        return pila.elemento(pila.tamanio());
    }
    public boolean esVacia(){
        return pila.esVacia();
    }
}