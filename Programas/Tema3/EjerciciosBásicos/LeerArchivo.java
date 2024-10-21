package Programas.Tema3.EjerciciosBásicos;

import java.io.File;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) throws Exception{
        String aux;
        Scanner f = new Scanner(new File("Prueba.txt"));
        aux = f.nextLine();
        System.out.println(aux);

        f.close();
    }
}
