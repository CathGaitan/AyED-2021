package Ejercicio5;
import PackDeCosas.*;
public class Mapa {
    private Grafo<String> mapaCiudades = new GrafoImplListAdy<>();
    
    public ListaEnlazadaGenerica<String> devolverCamino(String c1,String c2){
        ListaEnlazadaGenerica<String> lista = new ListaEnlazadaGenerica<>();
        boolean[] marcas = new boolean[mapaCiudades.listaDeVertices().tamanio()+1];
        for(int i=1;i<=mapaCiudades.listaDeVertices().tamanio();i++){
            if(!marcas[i]){
                this.devolverCamino(i,mapaCiudades,marcas,lista);
            }
        }
        return lista;        
    }

    private void devolverCamino (int i,Grafo<String> mapaCiudades, boolean[] marcas,ListaGenerica<String> lista){
        marcas[i]=true;
        Vertice<String> v= mapaCiudades.listaDeVertices().elemento(i); //pido el vertice
        lista.agregarFinal(v.dato()); //lo puedo Imprimir
        ListaGenerica<Arista<String>> ady = mapaCiudades.listaDeAdyacentes(v);//pido sus adyacentes
        ady.comenzar();
        while(!ady.fin()){ //recorro la lista de adyacencias (lista de aristas) CASO BASE
            int j=ady.proximo().verticeDestino().getPosicion();
            if(!marcas[j]){
                this.devolverCamino(j, mapaCiudades, marcas, lista); //si no visite a ese adyacente
            }                                                        //llamo recursivamente
        }          
    }
}
