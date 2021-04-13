package Ejercicio3;
import java.util.Scanner; 
public class test {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Estudiante[] vectorEstudiante;
        Profesor[] vectorProfesor;
        vectorEstudiante= new Estudiante[2];
        vectorProfesor= new Profesor[3];
        
        for(int i=0;i<2;i++){
            Estudiante est = new Estudiante();
            vectorEstudiante[i]=est;
            System.out.print("Nombre Estudiante "+i+": ");
            vectorEstudiante[i].setNombre(consola.nextLine());
            System.out.print("Apellido Estudiante "+i+": ");
            vectorEstudiante[i].setApellido(consola.nextLine());
            System.out.print("Comision Estudiante "+i+": ");
            vectorEstudiante[i].setComision(consola.nextInt());
            consola.nextLine(); //agrego porque el scanner no le gusta nextInt y luego nextLine
            System.out.print("Email Estudiante: "+i+": ");
            vectorEstudiante[i].setEmail(consola.nextLine());
            System.out.print("Direccion Estudiante: "+i+": ");
            vectorEstudiante[i].setDireccion(consola.nextLine());
        }
        for(int i=0;i<2;i++){
            System.out.println(vectorEstudiante[i].tusDatos());
        }
        for(int i=0;i<2;i++){
            Profesor pro = new Profesor();
            vectorProfesor[i]=pro;
            System.out.print("Nombre Profesor: "+i+": ");
            vectorProfesor[i].setNombre(consola.nextLine());
            System.out.print("Apellido Profesor: "+i+": ");
            vectorProfesor[i].setApellido(consola.nextLine());
            System.out.print("Catedra Profesor: "+i+": ");
            vectorProfesor[i].setCatedra(consola.nextLine());
            System.out.print("Email Profesor: "+i+": ");
            vectorProfesor[i].setEmail(consola.nextLine());
            System.out.print("Facultad Profesor: "+i+": ");
            vectorProfesor[i].setFacultad(consola.nextLine());
        }
        for(int i=0;i<2;i++){
            System.out.println(vectorProfesor[i].tusDatos());
        }
    }
}
