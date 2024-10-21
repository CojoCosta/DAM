import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int mayor;
        int menor;
        int suma;
        int resta;
        int multiplicacion;
        int cociente;
        int resto;
        System.out.print("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print("Dime otro numero: ");
        n2 = sc.nextInt();
        while (n2 == 0) { // "mientras" para hacer un condicional en bucle
            System.out.println("No puedes dividir entre 0");
            System.out.print("Dime otro numero: ");
            n2 = sc.nextInt();
        }
       
        if (n1>n2){
            mayor = n1;
            menor = n2;
        } else if (n1==n2){
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
         resto = mayor % menor;
        if (resto == 0){
            System.out.println ("Has elegido dos numeros multiplos entre si!!!");
        }
        suma = mayor + menor;
        System.out.println("La suma de los dos numeros que has elegido es: " + suma);
        resta = mayor - menor;
        System.out.println("La resta de los dos numeros que has elegido es: " + resta);
        multiplicacion = mayor * menor;
        System.out.println("La multiplicacion de los dos numeros que has elegido es: " + multiplicacion);
        cociente = mayor / menor;
        System.out.println("El cociente de la division de los dos numeros que has elegido es: " + cociente);
        if (mayor > menor){
        System.out.println(mayor + " es mayor que " + menor);
        } else if (mayor < menor){
            System.out.println(menor + " es un numero menor que " + mayor);
        } else {
            System.out.println ("Elegiste el mismo numero");
        }
}
}