package Ejercicio2;
import java.util.Scanner;
import PackDeCosas.*;
public class TestListaEnlazadaGenerica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ListaEnlazadaGenerica <Estudiante> lista = new ListaEnlazadaGenerica<>();
        for(int i=0; i<2; i++){
            Estudiante e=new Estudiante();
            System.out.print("Nombre Estudiante:");
            e.setNombre(consola.nextLine());
            System.out.print("Apellido Estudiante: ");
            e.setApellido(consola.nextLine());
            System.out.print("Comision Estudiante: ");
            e.setComision(consola.nextInt());
            consola.nextLine(); //agrego porque el scanner no le gusta nextInt y luego nextLine
            System.out.print("Email Estudiante: ");
            e.setEmail(consola.nextLine());
            System.out.print("Direccion Estudiante: ");
            e.setDireccion(consola.nextLine()); 
            lista.agregarFinal(e);
        }
        while (!lista.fin()){
            System.out.println(lista.proximo().tusDatos());
        }
        Estudiante [] vector;
        vector=new Estudiante[2];
        
        if (lista.agregar(vector)){
            System.out.println("Se agregaron correctamente");
        }else{
            System.out.println("ERRORR!");
        }
        
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i].getNombre());
            System.out.println(vector[i].getApellido());
            System.out.println(vector[i].getEmail());
            System.out.println(vector[i].getDireccion());
            System.out.println(vector[i].getComision());
            
        }
    }   
}
