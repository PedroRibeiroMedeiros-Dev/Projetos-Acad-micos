/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeindicadoresparesimpares;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeIndicadoresParesImpares {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [4][3];
        int j;
        int i;
        int par = 0;
        int impar = 0;
        for (i=0; i < m.length; i++){       
        for (j=0; j < m[i].length; j++)
        {        
        System.out.println("Informe o valor do numero da coluna " + (i+1) + " na linha " + (j+1));
         m[i][j] = leitor.nextInt();
         if (m[i][j] %2 ==0)
         {
             par = par + 1;
         }
             else
             {
                 impar = impar +1;
             }
         
    }
}
        System.out.print("A quantidade de pares e: " + par);
        System.out.print("A quantidade de pares e: " + impar);
    }
}
