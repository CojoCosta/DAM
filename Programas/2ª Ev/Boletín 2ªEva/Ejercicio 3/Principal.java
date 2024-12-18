public class Principal {
    public static void main(String[] args) {
        //#region EMPLEADO
        Empleado empleado1 = new Empleado(null, null, 0, null, 0);

        // Empleado empleado2 = new Empleado();

        // Empleado empleado3 = new Empleado();

        IUEmpleado iue1 = new IUEmpleado(empleado1);
        // IUEmpleado iue2 = new IUEmpleado(empleado2);
        // IUEmpleado iue3 = new IUEmpleado(empleado3);
        iue1.pedir();
        iue1.mostrar();
        iue1.mostrar(1);
        iue1.mostrar(2);
        iue1.mostrar(3);
        iue1.mostrar(4);
        iue1.mostrar(5);
        iue1.mostrar(0);
        // iue2.mostrar();
        // iue3.mostrar();
        //#endregion

        //#region DIRECTIVO
        Directivo directivo1 = new Directivo(null, null, 0, null, null, 0);
        
        IUDirectivo iud1 = new IUDirectivo(directivo1);
        iud1.pedir();
        iud1.mostrar(1);
        iud1.mostrar(2);
        iud1.mostrar(3);
        iud1.mostrar(4);
        iud1.mostrar(5);
        iud1.mostrar(0);
        //#endregion

    }
}
