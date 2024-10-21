import java.util.Scanner;

public class Hola2 {
    public static void main(String args[]) {
        // Declaración de variables
        String nombre; //"string" es una linea de caracteres
        int edad; //"int" variable donde guardo el dato
        Scanner sc = new Scanner(System.in); //CHAPARLA!!

        // Código
        System.out.print("Dime tu nombre: "); //print escribes en la misma linea
        nombre = sc.nextLine(); //"nextline" lee solo caracteres
        System.out.println("Ahora tu edad: "); //println escribes el dato en la linea siguiente
        edad = sc.nextInt(); //"nextInt"solo lee numeros
        System.out.println(nombre + ", Welcome to the Java World");
        System.out.println("Nos vemos, ser humano de " + edad + " años");
        }
}
