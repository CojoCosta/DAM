package Programas.Tema3.BoletinTema3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class Bol3_Ejer7 {
    public static String readFile(String fileName) throws Exception{
        Scanner f = new Scanner(new File(fileName));
        String contentFile = "";
        while (f.hasNext()) {
            contentFile = f.nextLine();
            System.out.println(contentFile);
        }
        f.close();
        return contentFile;
    }

    public static String appendFile(String fileName, String msg) throws Exception {
        PrintWriter fwritter = new PrintWriter(fileName);
        String content = readFile(fileName) + "\n" +  msg; // Leer contenido y añadir el msg
        fwritter.print(content + msg); // ReEscribir el archivo
        fwritter.close();
        return content;
    }

    public static void appendFile2(String fileName, boolean isAdd) throws Exception{
        PrintWriter f = new PrintWriter(new FileWriter(fileName, isAdd));
        f.println("Add text in to the final of the file");
        f.close();
    }
    
    public static void main(String[] args) throws Exception {
        PrintWriter fwriter = new PrintWriter("PRG_Archivos/Ex7_b3.txt");
        Scanner sc = new Scanner(System.in);
        String msg; // Almacena mensaje del user
        System.out.print("Introduce un mensaje: ");
        msg = sc.nextLine();
        fwriter.print(readFile("PRG_Archivos/Ex2_b3.txt") + appendFile("PRG_Archivos/Ex7_b3.txt", msg));
        appendFile2("PRG_Archivos/Ex7_b3.txt", true);
        fwriter.close();
    }
}