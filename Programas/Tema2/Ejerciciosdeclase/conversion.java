public class conversion {
    public static void main(String[] args) {
        // String dato = "231"; // Este numero se leeria como letra

        // int num = Integer.parseInt(dato);//paso a valor numerico entero
        // num recoge las cifras escrita y lo comvierte en numero
        // double num = double.parsedouble(dato); //pasa a valor numerico decimal
        // System.out.println(num + 5);ç

        // ______________________________________________________________________//
        // String otrodato = num + "";
        // pasar de valor numerico a string con una "cadena vacia"

        // ______________________________________________________________________//
        // double a = 34.12; //para convertir de double decimales
        // int b = (int)a; //a int enteros (se carga lops decimales sin redondeo)
        // System.out.println(b);
        // ______________________________________________________________________//

        double n1 = 12.652845;          //cada numero se expresa con %
        int n2 = 43;                    //%f para los n real y %d para decimal
        System.out.printf("El numero real es %.2f y el entero *%-5X*", n1, n2);
    }                                   //%".2" limita la cantidad de decimales que queremos mostrar
                                        //printf redondea
                                        //%x es para mostrar el numero en hexadecimal 
                                        //para hexadecimal en mayuscula %X
                                        //%o para octal

}
