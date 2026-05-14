public class AtividadeContarNumerosPositivos {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, -2, 3},
            {-4, 5, -6},
            {7, -8, 9} };

            int positivos = 0;

            for (int i =0; i<3; i++)
                {
                for (int j=0; j<3; j++)
                    {
                        if (matriz[i][j] > 0)
                            {
                                positivos++;
                            }
                    }
        }
        System.out.println("O número de elementos positivos na matriz é: " + positivos);
    }
}
