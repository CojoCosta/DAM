package Programas.Tema3.BoletinTema3;

public class Bol3_Ejer9 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.- Mostrar primos menores que uno dado: ");
            System.out.println("2.- Primos en archivo: ");
            System.out.println("3.- Archivo con primos:  ");
            System.out.println("4.- Salir.  ");
            switch option {
                case 1:
                    ;
                        break;
                case 2:
                    ;
                        break;
                case 3:
                    ;
                        break;
                case 4:
                    System.out.println("Gracias por venir");
                        break;
                default:
                    System.out.println("Opcion no valida");
                        break;
        } while (option!=4);
        
}
// 9. Modifica el ejercicio anterior de los números primos (solo el main) de forma
// que hagas un menú clásico con estas opciones:
// 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
// ejercicio previo.
// 2. Primos en archivo: Pide el nombre de un archivo que debe contener
// números, cada uno en una línea. Lee dicho archivo y muestra dichos números
// en pantalla diciendo si son o no primos.
// 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
// usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
// usuario. Estarán todos en la misma línea separados por punto y coma (;).
// 4 Salir: El programa solo finaliza si se selecciona esta opción.