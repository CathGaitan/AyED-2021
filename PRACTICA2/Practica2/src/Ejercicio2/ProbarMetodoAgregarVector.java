package Ejercicio2;
import java.util.Scanner;
import tp02.ejercicio2.ListaEnlazadaGenerica;
public class ProbarMetodoAgregarVector {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Estudiante [] vector;
        vector=new Estudiante[2];
        for(int i=0; i<vector.length; i++){
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
            vector[i]=e;
        }

        ListaEnlazadaGenerica <Estudiante> lista = new ListaEnlazadaGenerica<>();
        if (lista.agregar(vector)){
            System.out.println("Se agregaron correctamente");
        }else{
            System.out.println("ERRORR!");
        }

        while(!lista.fin()){
            System.out.println(lista.proximo().tusDatos());
        }
    }
}