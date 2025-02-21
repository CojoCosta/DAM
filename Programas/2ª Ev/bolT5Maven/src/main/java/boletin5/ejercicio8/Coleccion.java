package boletin5.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> videojuegos;

    public Coleccion() {
        this.videojuegos = new ArrayList<>();
    }

    public void setVideojuegos(ArrayList<Videojuego> coleccionVideojuegos) {
        this.videojuegos = coleccionVideojuegos;
    }

    public ArrayList<Videojuego> getVideojuegos() {
        
        return videojuegos;
    }
    public static String formatearString(String cadenaFormateada){
        if (cadenaFormateada.length() > 23) {
            return cadenaFormateada.substring(0, 19) + "...";
        } else{
            return cadenaFormateada;
        }
    }
    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        Videojuego nuevoVideojuego = new Videojuego(2020, "Diego");
        int option;
        do {
            System.out.println("1.- Añadir nuevo videojuego");
            System.out.println("2.- Visualizar la lista videojuegos");
            System.out.println("3.- Buscar videojuegos");
            System.out.println("4.- Eliminar videojuegos eligiendo una posición");
            System.out.println("5.- Borrar videojuego según el año");
            System.out.println("6.- Salir");
            System.out.print("Introduce una opción: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    boolean isCheck = false;
                    String nombreVideojuego;
                    String posicionVideojuego;

                    do {
                        nuevoVideojuego = new Videojuego(2020, "Diego");
                        System.out.print("Introduce el nombre del videojuego: ");
                        nombreVideojuego = sc.nextLine();
                        nuevoVideojuego.setTitulo(nombreVideojuego);

                        System.out.print("Lo quieres añadir al principio o al final (P (Principio) / F (Final)): ");
                        posicionVideojuego = sc.nextLine().toLowerCase();

                        if (posicionVideojuego.equals("p")) {
                            this.videojuegos.add(0, nuevoVideojuego);
                            isCheck = true;
                        } else if (posicionVideojuego.equals("f")) {
                            this.videojuegos.add(nuevoVideojuego);
                            isCheck = true;
                        } else {
                            System.out.println("Introduce \"p\" o \"f\" en minúscula");
                        }
                    } while (!isCheck);
                    break;
                case 2:
                    int indice = 1;
                    for (Videojuego videojuego : this.videojuegos) {
                            System.out.printf("\n%4d Título: %.23s, Fabricante: %.23s, año: %4d \n", indice,formatearString(videojuego.getTitulo()), formatearString(videojuego.getFabricante()), videojuego.getAño());
                        indice++;
                    }
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                default:

                    break;
            }

        } while (option != 6);
    }
}