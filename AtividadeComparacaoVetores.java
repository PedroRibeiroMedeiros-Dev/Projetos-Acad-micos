   import java.util.Scanner;

public class AtividadeComparacaoVetores//Pedro Ribeiro Medeiros
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int iguais = 0;

        System.out.println("Digite 5 valores para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Digite 5 valores para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (vetorA[i] == vetorB[i]) {
                iguais = iguais + 1;
            }
        }

        System.out.println("Posicoes com valores iguais: " + iguais);

	}
}