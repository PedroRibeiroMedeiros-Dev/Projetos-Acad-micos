import java.util.Scanner;

public class AtividadeAnaliseNotas//Pedro Ribeiro Medeiros
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] notas = new double[6];

        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("Digite 6 notas de 0 a 10: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Nota " + i + ": ");
            notas[i] = leitor.nextDouble();
            soma = soma + notas[i];
        }

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 0; i < 6; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 6) {
                aprovados = aprovados + 1;
            } else {
                reprovados = reprovados + 1;
            }
        }

        double media = soma / 6.0;
        
        System.out.println("Resultados:");
        System.out.println("Media: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Notas >= 6: " + aprovados);
        System.out.println("Notas abaixo de 6: " + reprovados);

	}
}