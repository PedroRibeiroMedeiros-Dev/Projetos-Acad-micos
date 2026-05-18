	import java.util.Scanner;

public class Valores//Pedro Ribeiro Medeiros
{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[10];

        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0; 
        int faixa4 = 0;

        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.println("A posicao sera: " + i);
            num[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] >= 0 && num[i] <= 25) {
                faixa1 = faixa1 + 1;
            } else if (num[i] >= 26 && num[i] <= 50) {
                faixa2 = faixa2 + 1;
            } else if (num[i] >= 51 && num[i] <= 75) {
                faixa3 = faixa3 + 1;
            } else if (num[i] >= 76 && num[i] <= 100) {
                faixa4 = faixa4 + 1;
            }
        }

        System.out.println("Entre 0 e 25: " + faixa1);
        System.out.println("Entre 26 e 50: " + faixa2);
        System.out.println("Entre 51 e 75: " + faixa3);
        System.out.println("Entre 76 e 100: " + faixa4);

	}
}