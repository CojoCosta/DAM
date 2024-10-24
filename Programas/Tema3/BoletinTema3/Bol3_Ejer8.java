package Programas.Tema3.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer8 {

    public static boolean primo(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static void numerosPrimos(int n) {
        for (int i = 2; i <= n; i++) {
            if (primo(n)) {
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero mayor que 2: ");
        numero = sc.nextInt();
        System.out.println(primo(numero));
        numerosPrimos(numero);
    }
}
