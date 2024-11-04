package Programas.Tema3.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer8 {
/**
 * Programa para saber si un numero es primo
 * @param n numero a comprobar
 * @return si es primo o no 
 */
    public static boolean primo(int n) {// TODO revisar, dice si es par o impar
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
/**
 * escribe los numeros primos desde el 2 hasta al numero introducido
 * @param n numero introducido
 */
    public static void numerosPrimos(int n) {
        for (int i = 2; i <= n; i++) {
            if (primo(n)) {
                System.out.println();
            }
        }

    }

    public static void main(String[] args) { // TODO mostrar primos menores que uno dado
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero mayor que 2: ");
        numero = sc.nextInt();
        System.out.println(primo(numero));
        numerosPrimos(numero);
    }
}
