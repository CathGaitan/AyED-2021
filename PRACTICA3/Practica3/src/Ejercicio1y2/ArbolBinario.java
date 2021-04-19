package Ejercicio1y2;
import tp02.ejercicio2.*;
public class ArbolBinario<T> {
    private T dato;
    private ArbolBinario<T> hijoIzquierdo;   
    private ArbolBinario<T> hijoDerecho; 
	
    public ArbolBinario() {
	super();
    }

    public ArbolBinario(T dato) {
	this.dato = dato;
    }

    /*getters y settes*/
    public T getDato() {
	return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
	
    /* Preguntar antes de invocar si tieneHijoIzquierdo() @return*/
    public ArbolBinario<T> getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }

    public ArbolBinario<T> getHijoDerecho() {
        return this.hijoDerecho;
    }

    public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
        this.hijoIzquierdo = hijo;
    }

    public void agregarHijoDerecho(ArbolBinario<T> hijo) {
        this.hijoDerecho = hijo;
    }

    public void eliminarHijoIzquierdo() {
        this.hijoIzquierdo = null;
    }

    public void eliminarHijoDerecho() {
        this.hijoDerecho = null;
    }

    public boolean esVacio() {
        return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
    }

    public boolean esHoja() {
        return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());
    }

    @Override
    public String toString() {
        return this.getDato().toString();
    }

    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo!=null;
    }
	 
    public boolean tieneHijoDerecho() {
        return this.hijoDerecho!=null;
    }

    public boolean esLleno() {
        return false;
    }

    public boolean esCompleto() {
	return false;
    }

    public ListaGenerica<T> frontera() {
	ListaGenerica<T> l = new ListaEnlazadaGenerica<>();
	return l;
    }
	
    public int altura(){
        if (this.esVacio())
            return -1; //arbol vacio
        else{
            int altIzq=-1,altDer=-1;
            if(this.tieneHijoIzquierdo()){
                altIzq=this.getHijoIzquierdo().altura();
            }
            if(this.tieneHijoDerecho()){
                altDer=this.getHijoDerecho().altura();
            }
            return Math.max(altIzq, altDer)+1;
        }
    }
 
 //----------------PRINTS------------------------------------------
    
    public void printPreorden() {
        System.out.println(this.getDato());
        if(this.tieneHijoIzquierdo())
            this.getHijoIzquierdo().printPreorden();
        if(this.tieneHijoDerecho())
            this.getHijoDerecho().printPreorden();
    }

    public void printPostorden() {
        if(this.tieneHijoIzquierdo())
            this.getHijoIzquierdo().printPreorden();
        if(this.tieneHijoDerecho())
            this.getHijoDerecho().printPreorden();
        System.out.println(this.getDato());
    }
    public void printInorden(){  //REVISAR
        if(this.tieneHijoIzquierdo())
            this.getHijoIzquierdo().printPreorden();
        System.out.println(this.getDato());       
        if(this.tieneHijoDerecho())
            this.getHijoDerecho().printPreorden(); 
    }

    public void printPorNiveles() {
        ColaGenerica<ArbolBinario<T>> cola= new ColaGenerica<>();
        ArbolBinario <T> arbol=null;
        cola.encolar(this);
        cola.encolar(null);
        while(!cola.esVacia()){
            arbol=cola.desencolar();
            if(arbol != null){
                System.out.print(arbol.getDato());
                if(arbol.tieneHijoIzquierdo())
                    cola.encolar(arbol.getHijoIzquierdo());
                if(arbol.tieneHijoDerecho())
                    cola.encolar(arbol.getHijoDerecho());
            }else if (!cola.esVacia()){
                System.out.println();
                cola.encolar(null);
            }
        }            	
    }

    public void entreNiveles(int n, int m){ 
        int altura=0;
        ColaGenerica<ArbolBinario<T>> cola= new ColaGenerica<>();
        ArbolBinario <T> arbol;
        cola.encolar(this);
        cola.encolar(null);
        if ((n>=0)&&(m<=this.altura())){
            while(!cola.esVacia()){
                arbol=cola.desencolar();
                if(arbol == null){ //si llegue al fin del nivel
                    if(!cola.esVacia()){
                         cola.encolar(null);
                        altura++;
                    }
                } else {
                    if((n<=altura)&&(m>=altura)){
                        System.out.print(arbol.getDato());
                    }
                    if(arbol.tieneHijoIzquierdo())
                        cola.encolar(arbol.getHijoIzquierdo());
                    if(arbol.tieneHijoDerecho())
                        cola.encolar(arbol.getHijoDerecho());
                }
            }
        }
    }

//----------------------------------------------------------------------
    public int contarHojas() { 
        int contHI=0,contHD=0;
        if(this.esHoja()){
            return 1;
        }else{
            if(this.tieneHijoIzquierdo())
                contHI=this.getHijoIzquierdo().contarHojas();
            if(this.tieneHijoDerecho())
                contHD=this.getHijoDerecho().contarHojas();
        }
        return contHI+contHD;
    }
    
    public int contarNodos(){
        int cantidad=0;
        if (!this.esVacio()){
            cantidad++;
            if(this.tieneHijoIzquierdo())
                cantidad+=this.getHijoIzquierdo().contarNodos();
            if(this.tieneHijoDerecho())
                cantidad+=this.getHijoDerecho().contarNodos();
        }
        return cantidad;
    }
        
    public ArbolBinario<T> espejo(){  //INCORRECTO
        if(this.esVacio()){
            return new ArbolBinario<>();
        }else{
            ArbolBinario<T> nuevoArbol =new ArbolBinario<>(this.getDato()); //pongo la raiz
            if (this.tieneHijoIzquierdo())
                nuevoArbol.agregarHijoDerecho(this.getHijoIzquierdo());
            if (this.tieneHijoDerecho())
                nuevoArbol.agregarHijoIzquierdo(this.getHijoDerecho());
            return nuevoArbol;
        }
    }
    
   
}
