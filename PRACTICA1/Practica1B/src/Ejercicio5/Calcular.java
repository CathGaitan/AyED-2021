package Ejercicio5;
public class Calcular {
    static int max=-9999;
    static int min=9999;
    static int promedio; //variables globales a la clase
    
    public static void SacarValoresConParametros(Datos d){
        int max=-9999, min=9999;
        int promedio=0;
        for (int i=0; i < d.getVecEnteros2().length;i++){
            if (d.getVecEnteros2()[i] > max)
                max=d.getVecEnteros2()[i];
            if (d.getVecEnteros2()[i] < min)
                min=d.getVecEnteros2()[i];
            promedio=promedio+d.getVecEnteros2()[i]; 
        }
        d.setMax(max);
        d.setMin(min);
        d.setPromedio(promedio/d.getVecEnteros2().length);
    }
    public static Datos SacarValoresConReturn(int[] vecEnteros){ 
        int max=-9999, min=9999;
        int promedio=0;
        for (int i=0; i < vecEnteros.length;i++){
            if (vecEnteros[i] > max)
                max=vecEnteros[i];
            if (vecEnteros[i] < min)
                min=vecEnteros[i];
            promedio=promedio+vecEnteros[i]; 
        }
            Datos obj = new Datos();
            obj.setMax(max);
            obj.setMin(min);
            obj.setPromedio(promedio/vecEnteros.length);
            return obj; 
    }
    //1) Clase que uso para calcular los 3 valores que me piden
    //   luego creo un objeto de tipo Datos para poder retornarlo
    //   y mandarlo hacia el main.
    //2) El metodo SacarValores es STATIC ya que se puede utilizar
    //   con cualquier arreglo de enteros que tenga, no es
    //   especifico para ningun objeto.   
    
    public static void SacarValoresSinNada(int [] vecEnteros){
        for (int i=0; i < vecEnteros.length;i++){
            if (vecEnteros[i] > max)
                max=vecEnteros[i];
            if (vecEnteros[i] < min)
                min=vecEnteros[i];
            promedio=promedio+vecEnteros[i];
        }
        promedio=promedio/vecEnteros.length;
        System.out.println("Max: "+max+" Min: "+min+" Promedio: "+promedio);
    }
}
