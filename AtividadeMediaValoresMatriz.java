public class AtividadeMediaValoresMatriz {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

            int soma = 0;
            int quantidadeElementos = 0;

            for (int i =0; i<3; i++)
                {
                for (int j=0; j<3; j++)
                    {
                        soma += matriz[i][j];
                        quantidadeElementos++;
                    }
        }
        double media = (double) soma / quantidadeElementos;
        System.out.println("A média dos valores da matriz é: " + media);
    }
}
