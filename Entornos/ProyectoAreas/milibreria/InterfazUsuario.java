package milibreria;

import java.util.Scanner;

public class InterfazUsuario {
    private Scanner sc = new Scanner(System.in);
    
    public double pideRealPositivo(String mensaje) {
        double numero;
        do {
            System.out.println(mensaje);
            numero = sc.nextDouble();
        } while (numero <= 0);
        return numero;
    }
    public void muestraArea(double numero) {
        System.out.printf("El área es de %.2f unidades cuadradas\n", numero);
    }
}
