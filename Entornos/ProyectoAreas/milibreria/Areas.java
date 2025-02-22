package milibreria;

public class Areas {
    private Areas() {
    }

    public static double circulo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double triangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static double rectangulo(double base, double altura) {
        return base * altura;
    }

    public static double pentagonoRegular(double lado) {
        return 1.7205 * lado * lado;
    }
}
