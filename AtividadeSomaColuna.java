public class AtividadeSomaColuna {
    
    public static void main (String[] args){

    int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

            for(int i= 0; i<matriz.length;i++){
                int soma = 0;
                for(int j=0; j<matriz[i].length;j++){
                    soma += matriz[j][i];
                }
                System.out.println("A soma dos elementos da coluna " + (i+1) + " é: " + soma);
            }
    }
}
