package Programas.Tema3.EjerciciosBásicos;

import java.io.PrintWriter;

public class archivos {
    public static void main(String[] args) throws Exception {
        //Apertura
        PrintWriter f = new PrintWriter("Prueba.txt");
        
        //Escritura
        f.print("Prueba de archivos. \n");
        f.printf("%5.2f",Math.PI);
        //Cierre
        f.close();
    }
}
