import java.util.Scanner;

public class BuscaVetor //Pedro Ribeiro Medeiros
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[6];

        System.out.println("Digite 6 numeros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Posicao " + i + ": ");
            num[i] = leitor.nextInt();
        }

        System.out.print("\nDigite o numero para buscar: ");
        int busca = leitor.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 6; i++) {
            if (num[i] == busca) {
                encontrado = true;
                posicao = i;
            }
        }

        if (encontrado) {
            System.out.println("Numero encontrado na posicao " + posicao);
        } else {
            System.out.println("Numero nao existe no vetor");
        }

    }
}