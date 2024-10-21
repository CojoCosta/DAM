import java.util.Scanner;

public class ejerciciosBasicos {
    public static void saludo10() {
        for (int i = 1; i <= 10; i++)
            System.out.println("HOLA");
    }

    public static void variosSaludos(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("HOLA");
        }
    }

    public static void pintaMensaje(String msg) {
        System.out.println(msg);

    }

    public static void pintaVariosMensajes(String msg, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(msg);
        }
    }
    public static int sumaN(int n){
        int acu = 0;
        for(int i = 1; i <= n ; i++){
            acu = acu + i;
        }
        return acu;
    }
    public static int pideNumero(String msg){
        Scanner sc= new Scanner(System.in);
        System.out.println(msg);
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        saludo10();
        System.out.println();
        variosSaludos(2);
        System.out.println();
        variosSaludos(5);
        System.out.println();
        pintaMensaje("Adios");
        System.out.println();
        pintaVariosMensajes("Adios", 3);
        System.out.println(sumaN(5));
        System.out.println();
        int num = pideNumero("Dime un número y te diré el doble");
        System.err.println(num * 2);
    }
}
