package Programas.Tema3.BoletinTema3;
import java.util.Scanner;
import java.io.File;

public class Bol3_Ejer7 {
public static String loadFile(String archivo) throws Exception{
    Scanner leer = new Scanner(new File(archivo));
    String contenido = "";
    while (leer.hasNext()) {
        contenido = leer.nextLine();
        System.out.println(contenido);
    }
    leer.close();
    return contenido;
}
public static 
    public static void main(String[] args) throws Exception{
        loadFile("Ej1.txt");
    }
}
