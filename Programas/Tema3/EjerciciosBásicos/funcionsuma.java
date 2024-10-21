import java.util.Scanner;

public class funcionsuma {
    public static int sumaHastan(int n) {
        Scanner sc = new Scanner(System.in);
        int acu = 0;
        System.out.print("Dime el numero hasta que quieras sumar: ");
        n = sc.nextInt();
        for (int cont = 0; cont < n; cont++) {
            acu = acu + cont;
        return acu;
    }

    public static void main(String[] args) {
            
            System.out.println(sumaHastan(n));

        }
    }
}