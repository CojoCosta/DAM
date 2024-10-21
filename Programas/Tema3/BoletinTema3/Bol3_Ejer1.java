package Programas.Tema3.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer1 {
    /**
     * Bucle de numero de líneas
     * @param n
     */
    public static void lineasBlanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    /**
     * Comprobador de par o impar
     * @param n
     * @return verdadero si es par falso si es impar
     */
    public static boolean par(int n) {
        return n % 2 == 0 ? true : false;
    }
    /**
     * Comprobador de positivo o negativo
     * @param n
     * @return P si es positivo y N si es negativo
     */
    public static String positivo(int n) {
        return n >= 0 ? "P" : "N";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        lineasBlanco(10);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("\nTu numero es: " + par(numero) + " y " + positivo(numero));
    }
}
