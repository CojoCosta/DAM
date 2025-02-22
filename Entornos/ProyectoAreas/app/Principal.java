package app;

//con "InterfazUsuario" se crea el import que nos indica que vamos a utilizar la carpeta milibreria y el proyecto interfaz...
// import milibreria.InterfazUsuario;
// import milibreria.Areas;
//Con el asterisco indicamos que vamos a utilizar todos los proyectos de la carpeta "milibreria"
import milibreria.*;

public class Principal {
    public static void main(String[] args) {
        InterfazUsuario iu = new InterfazUsuario();
        double lado;
        double area;

        System.out.println("Vamos a calcular el área de un pentágono");
        lado = iu.pideRealPositivo("Introduce el lado (debe serpositivo)");

        area = Areas.pentagonoRegular(lado);
        iu.muestraArea(area);
    }
}