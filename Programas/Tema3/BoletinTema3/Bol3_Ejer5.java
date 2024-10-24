package Programas.Tema3.BoletinTema3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer5 {
    public static void  años(int año){
        for (int i = 2024; i > año; i--){
            ;
            System.out.println(año);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        PrintWriter f = new PrintWriter("Ej5.txt");
        System.out.print("Dime un año: ");
        int año = sc.nextInt();
        años(año);
        Bol3_Ejer4.bisiesto(año);
        f.print(Bol3_Ejer4.bisiesto(año));
        f.close();
    }
}