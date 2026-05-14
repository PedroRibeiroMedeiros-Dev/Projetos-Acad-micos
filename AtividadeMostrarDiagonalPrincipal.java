public class AtividadeMostrarDiagonalPrincipal {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

            System.out.println("Elementos da diagonal principal:");
            for (int i =0; i<3; i++)
                {
                    System.out.println("Os elementos da diagonal principal são: " + matriz[i][i]);
                }
        
    }
}
