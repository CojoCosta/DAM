import java.util.Scanner;

public class Ej2{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int suma;
        System.out.print ("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print ("Dime otro numero: ");
        n2 = sc.nextInt();
        suma = n1 + n2;
        System.out.print ("La suma de los dos numeros que has elegido es: " + suma);
        
    }
}
