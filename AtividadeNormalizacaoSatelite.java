/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadenormalizacaosatelite;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeNormalizacaoSatelite {//Pedro Ribeiro Medeiros

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double [] [] dad = new double [4] [4];
        double [] [] img = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}           
        };
        int i;
        int j = 0;
        for (i=0; i<dad.length; i++)
        {
          for(j=0;j<dad[i].length;j++)
          {
              System.out.print("Insira o valor da imagem " + (j+1) + " na coluna " + (i+1));
              dad[i][j] = leitor.nextDouble();
              
              if(dad[i][j]>=50)
              {
                 img[i][j] = dad[i][j]; 
              }
              else
              {
                  dad[i][j] = 0;
              }
              
          }
    }
        for(i=0;i<img.length;i++)
        {
            for(j=0;j<dad[i].length;j++)
            {
                    System.out.println("A imagem final do satelite ficara da seguinte forma: " + img[i][j]);
            }
}
}
}
