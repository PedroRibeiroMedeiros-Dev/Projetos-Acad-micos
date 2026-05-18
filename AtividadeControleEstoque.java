/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecontroleestoque;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeControleEstoque {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [2][4];
        int j=0;
        int i = 0;
        int zero = 0;
        for (i=0; i < m.length; i++){       
        for (j=0; j < m[i].length; j++)
        {        
        System.out.println("Informe a quantidade de produtos no deposito " + i + " na posicao " + j);
         m[i][j] = leitor.nextInt();
         if (m[i][j]==0)
         {
             zero = zero +1;
         }
        }
    }
        System.out.print(" A quantidade de itens zerados sao: " + zero);
    }
}
