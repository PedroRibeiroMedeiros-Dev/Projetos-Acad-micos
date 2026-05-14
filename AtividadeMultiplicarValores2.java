public class AtividadeMultiplicarValores2 {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
        
            int [][] dobro = new int[3][3];
            for (int i =0; i<3; i++)
                {
            
                for (int j=0; j<3; j++)
                    {
                        dobro[i][j] = matriz[i][j] * 2;
                    }
                }
                System.out.println("A matriz com os valores multiplicados por 2 é: ");
                for (int i =0; i<3; i++)
                {
                    for (int j=0; j<3; j++)
                    {
                        System.out.print(dobro[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}
