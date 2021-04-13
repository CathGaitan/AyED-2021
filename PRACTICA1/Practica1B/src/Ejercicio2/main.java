package Ejercicio2;
import java.util.Scanner; 
public class main {
    public static void main(String[] args) {
        Clase1 clase = new Clase1();
        Scanner s = new Scanner(System.in);
        System.out.print("Escriba n: ");
        int n=s.nextInt(); 
        for(int i=0;i<n;i++){
           System.out.println(clase.devolverVector(n)[i]);
        }
    }
}
