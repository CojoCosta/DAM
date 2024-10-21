import java.util.Scanner;

public class Ej5{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double temperatura;
        System.out.print("Escriba su nombre: ");
        nombre = sc.nextLine();
        System.out.print ("Escriba su edad: ");
        edad = sc.nextInt();
        System.out.print("Que temperatura hace ahora:");
        temperatura = sc.nextDouble();
         System.out.println ("Su nombre es: " + nombre + "\nSu edad es: " + edad + "\nLa temperatura de hoy es: " + temperatura);
    }
}