package Programas.Tema3.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer6 {
    /**
     * Ejercicio de calcular el resultado de una potencia
     * @param base
     * @param exponente
     * @return resultado potencia
     */
    public static double potencia(double base, int exponente) {
        double acu = 1;
        if (exponente >= 0) {
            for (int i = 1; i <= exponente; i++) {
                acu = acu * base;
            } 
        }else {
            // base = 1/base;
            // exponente=-exponente;
                for (int i = 0; i > exponente; i--) {
                    acu = acu * (1/base);
            }
        }
        return acu;
    }
    /**
     * Muestra todas las potencias
     * @param n Base
     * @param a Exponente
     */
    public static void numeroPotencias(double n, int a){
        for(int i = 0; i < a ; i++){
            System.out.printf("\n%.2f\n", potencia(n, i) );
        }        
    }
    /**
     * Suma de las potencias
     * @param x Base
     * @param y Exponente
     * @return
     */
    public static double progresionGeometrica(double x, int y){
        double acu = 0;
        for(int i = 1; i <= y ; i++){//TODO usar potencia
            acu = (acu * x) + 1;
        }
        return acu ;
    }

       public static void main(String[] args) {

        /** apartado a */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la base: ");
        double base = sc.nextDouble();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        System.out.printf("\nEl resultado es: %.2f\n", potencia(base, exponente));

        /** Apartado b */
        numeroPotencias(base, exponente);

        /**Apartado c */
        System.out.println(progresionGeometrica(base, exponente));
        
    }
}