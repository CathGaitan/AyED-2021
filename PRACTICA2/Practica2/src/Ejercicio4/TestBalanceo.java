package Ejercicio4;
import PackDeCosas.*;
import java.util.Scanner;
public class TestBalanceo {
    private static boolean esBalanceado(String s){
        ListaGenerica<Character> apertura = new ListaEnlazadaGenerica<>();
        apertura.agregarFinal('(');
        apertura.agregarFinal('[');
        apertura.agregarFinal('{');
        ListaGenerica<Character> cierre = new ListaEnlazadaGenerica<>();
        cierre.agregarFinal(')');
        cierre.agregarFinal(']');
        cierre.agregarFinal('}');
        PilaGenerica<Character> pila = new PilaGenerica<>();
        
        Character actual,elem;
        for (int i=0; i<s.length();i++){
            actual = s.charAt(i); //actual=Caracter de mi String
            if (apertura.incluye(actual)){ 
                pila.apilar(actual); //si es de apertura, lo apilo
            }else{
                elem=pila.desapilar();
                if(apertura.posicion(elem) != cierre.posicion(actual))
                    return false;
            }
        }
        return pila.esVacia();
    }
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.print("Ingrese un string: ");
        String s=consola.nextLine(); //Leo mi string y lo guardo en S
        if(esBalanceado(s)){
            System.out.println("Su string esta balanceado");
        } else{
            System.out.println("Su string NO esta balanceado");
        }
    }
}
