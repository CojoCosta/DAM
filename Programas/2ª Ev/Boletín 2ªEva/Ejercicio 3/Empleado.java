public class Empleado {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;

    //#region GET SET 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    public double getSalarioAnual() {
        return salarioAnual;
    }
    public double getIrpf() {
        if (salarioAnual<6000) {
            return irpf = 7.5;
        } else if (salarioAnual >= 6000 || salarioAnual <= 30000) {
            return irpf = 15;
        } else if (salarioAnual > 30000){
            return irpf = 20;
        } return 20;
    }
    //#endregion
    //#region CONSTRUCTORES
    public Empleado(){
    nombre = " ";
    apellidos = " ";
    edad = 0;
    dni = " ";
    salarioAnual = 0;
    }
    public Empleado(String nombre, String apellidos, int edad, String dni, double salarioAnual){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setSalarioAnual(salarioAnual);
    }
    //#endregion
    //#region METODOS
    double irpf(){
        return (getSalarioAnual() * getIrpf() / 100);
    } 
    //#endregion
}