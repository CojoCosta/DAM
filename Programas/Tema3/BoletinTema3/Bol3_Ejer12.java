package Programas.Tema3.BoletinTema3;

public class Bol3_Ejer12 {
    public static char generarQuiniela(){
        int numeroAleatorio = (int) (Math.random() * 3);
        return numeroAleatorio == 1 ? '1' : numeroAleatorio == 2 ? 'X' : '2';
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(generarQuiniela());
        }
    }
}
