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
// 12. a) Codificar un programa que genere una quiniela aleatoria. Es decir, se deben
// dar 14 resultados aleatorios como 1, X ó 2 indicando delante el número de partido
// y los resultados alineados en una columna (no uses \t, si no ajuste con printf ). Se
// debe realizar al menos una función que devuelva un 1 una X o un 2 (char o String)
// aleatorio.
// b) Realizar la quiniela ponderada, es decir, haz otra función que devuelva 1, X o 2
// pero que la probabilidad de sacar 1 sea del 60%, la de sacar X sea 25% y la de
// sacar un 2 sea un 15%.
// Enel main debes dar a elegir quiniela normal o ponderada.
// Pista: Sacar un numero aleatorio entre 1 y 100. Si el resultado es menor o igual
// que 60, se asigna un 1 al resultado, si es entre 61 y 85 (60+25) se le asigna una X
// y si es entre 86 y 100 se le asigna un 2.
