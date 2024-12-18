import java.util.Scanner;

public class IUDirectivo {
    Scanner sc = new Scanner(System.in);
    public Directivo directivo1;

    public IUDirectivo(Directivo directivo) {
        this.directivo1 = directivo;
    }

    public void mostrar(int opcion) {

        switch (opcion) {
            case 1:
                System.out.printf("\n\n%s %s", directivo1.getNombre(), directivo1.getApellidos());
                break;

            case 2:
                System.out.printf("\n\nEdad de %d", directivo1.getEdad());
                break;

            case 3:
                System.out.printf("\n\nDNI: %s", directivo1.getDni());
                break;

            case 4:
                System.out.printf("\n\nSalario anual: %s", directivo1.getDepartamento());
                break;

            case 5:
                System.out.printf("\n\nBeneficios: ", directivo1.getPorcentajeBeneficios());
                break;

            default:
                System.out.println("\n\nVenga a tomar por culo\nTodos los pesados me tocan a mi");
                break;
        }
    }

    public void pedir() {
        System.out.print("Nombre: ");
        directivo1.setNombre(sc.nextLine());
        System.out.print("Apellidos: ");
        directivo1.setApellidos(sc.nextLine());
        System.out.print("Edad: ");
        directivo1.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("DNI: ");
        directivo1.setDni(sc.nextLine());
        System.out.print("Departamento: ");
        directivo1.setDepartamento(sc.nextLine());
        System.out.print("Porcentaje Beneficios: ");
        directivo1.setPorcentajeBeneficios(sc.nextDouble());
    }
}
