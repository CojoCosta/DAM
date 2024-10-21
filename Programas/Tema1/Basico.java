import java.util.Scanner;

public class Basico{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String direccion;
        int edad;
        System.out.println("Bienvenidos a mi superprograma v1.0");
        System.out.println("Ahora unas preguntas");
        System.out.print("x: Dime tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Dime tu direccion: ");
        direccion = sc.nextLine();
        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();
        System.out.println("Te llamas " + nombre + " vives en " + direccion + " y tienes " + edad + " años.");
    }   
}





