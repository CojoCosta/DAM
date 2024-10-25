package Programas.Tema3.BoletinTema3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer5 {
    public static void años(int año) throws Exception {
        PrintWriter f = new PrintWriter("Ej5.txt");
        if (Bol3_Ejer4.bisiesto(año)) {
            f.printf("EL %d es bisiesto", año);
        } else {
            f.printf("\nEl %d no es bisiesto", año);
        }
        for (int i = año; i <= 2024; i++) {
            if (Bol3_Ejer4.bisiesto(i)) {
                f.printf("\n%d", i);
            }
        }
        f.close();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un año: ");
        int año = sc.nextInt();
        años(año);
        sc.close();
        Scanner t = new Scanner(new File("Ej5.txt"));
        String linea;
        linea = t.nextLine();
        System.out.println(linea);
        System.out.println();
        for (int i = año; i <= 2024; i++) {
            if (Bol3_Ejer4.bisiesto(i)) {
                linea = t.nextLine();
                System.out.printf("%6s, ",linea);
            }
        }
        t.close();
    }
}