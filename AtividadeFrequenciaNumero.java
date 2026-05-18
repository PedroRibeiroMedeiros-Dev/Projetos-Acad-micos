import java.util.Scanner;

public class AtividadeFrequenciaNumero//Pedro Ribeiro Medeiros
 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[8];
        int contador = 0;

        System.out.println("Digite 8 numeros:");
        for (int i = 0; i < 8; i++) {
            System.out.println("A posicao sera" + i);
            num[i] = leitor.nextInt();
        }

        System.out.print("\nDigite o valor para buscar: ");
        int valor = leitor.nextInt();

        for (int i = 0; i < 8; i++) {
            if (num[i] == valor) {
                contador = contador + 1;
            }
        }

        System.out.println("O valor " + valor + " aparece " + contador + " vezes");

    }
}