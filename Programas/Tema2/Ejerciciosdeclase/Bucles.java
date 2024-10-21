public class Bucles {
    public static void main(String[] args) {
//Se repite el while hasta que la condición es falsa        
        int cont = 1;
//            System.out.println("hola " + cont);
//            cont = cont + 1;
//        }
        int acu = 0;
        while (cont <=10) {
            System.out.println("Cont: " + cont);
            acu = acu + cont;
        //    cont = cont + 1;
        //    cont += 1; //Es la expresion de cont+1 abreviada. resta cont-=1
            cont++; //La expresion mas abreviada. cont-- para restar de 1 en 1
            System.out.println("Acu: " + acu);
        }
        System.out.println("La suma es: " + acu);
    }
    
}
