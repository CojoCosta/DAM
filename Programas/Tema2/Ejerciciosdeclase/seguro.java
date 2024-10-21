import java.util.Scanner;

public class seguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int edad;
        int carnet;

        System.out.print("¿Cual es su edad?  ");
        edad = sc.nextInt();
        System.out.print("¿Cuantos años de carnet teine?  ");
        carnet = sc.nextInt();
        //ambas válidas
        //base = 300;
        
        //if (edad < 21){
         //   base = base + 100;
        //} 
        //if (carnet > 10) {
        //    base = base - 30;
        //}
        if (edad < 21){
            base = 400;
        } else{
            if (carnet <= 10) {
                base = 300;
            } else{
                base = 270;
            }
        }
        System.out.print("El precio de su seguro es: " + base);
    }
}
