import java.util.Scanner;

public class Ej3{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int suma;
        int cociente;
        int resto;
        System.out.print ("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print ("Dime otro numero: ");
        n2 = sc.nextInt();
        suma = n1 + n2;
        System.out.println ("La suma de los dos numeros que has elegido es: " + suma);
        cociente = n1 / n2;
        System.out.println("El cociente de la division de los dos numeros que has elegido es: " + cociente);
        resto = n1 % n2;
        System.out.print("El resto de la division de los dos numeros que has elegido es: " + resto);
    }
}