		import java.util.Scanner;

public class AtividadeAnaliseCompletaVetor//Pedro Ribeiro Medeiros
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[8];
        int soma = 0;
        int positivos = 0;
        
        System.out.println("Digite 8 numeros:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicao do numero e: " + i);
            num[i] = leitor.nextInt();
        }
        
        int maior = num[0];
        int menor = num[0];

        for (int i = 0; i < num.length; i++) {
            soma += num[i];

            if (num[i] > maior) {
                maior = num[i];
            }

            if (num[i] < menor) {
                menor = num[i];
            }

            if (num[i] > 0) {
                positivos++;
            }
        }

        double media = soma / 8.0;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Quantidade de positivos: " + positivos);

    }
}