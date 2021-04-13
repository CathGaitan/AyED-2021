package Ejercicio5;
public class main {
    public static void main(String[] args) {
        
        //Calculo los valores y los devuelvo con un return
        int [] vecEnteros = {11,2,53,34}; 
        Datos maxminprom = Calcular.SacarValoresConReturn(vecEnteros);
        System.out.println("El maximo es "+maxminprom.getMax());
        System.out.println("El minimo es "+maxminprom.getMin());
        System.out.println("El promedio es "+maxminprom.getPromedio());
        
        //Calculo los valores y los devuelvo a traves de mi objeto
        int [] vecEnteros2 = {10,99,55,4,20};
        Datos maxminprom2 = new Datos();
        maxminprom2.setVecEnteros2(vecEnteros2);
        Calcular.SacarValoresConParametros(maxminprom2);
        System.out.println("El maximo es "+maxminprom2.getMax());
        System.out.println("El minimo es "+maxminprom2.getMin());
        System.out.println("El promedio es "+maxminprom2.getPromedio());
        
        int [] vecEnteros3 = {44,33,6,7,23};
        Calcular.SacarValoresSinNada(vecEnteros3); //metodo de clase
      
    }
}
