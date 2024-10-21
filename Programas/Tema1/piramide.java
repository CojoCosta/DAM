public class piramide {
    public static void main(String[] args) {
        int filas = 5; // Puedes cambiar este valor para hacer la pirámide más alta

        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }
}