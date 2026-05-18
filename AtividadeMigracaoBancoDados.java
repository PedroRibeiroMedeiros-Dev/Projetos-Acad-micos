/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademigracaobancodados;

/**
 *
 * @author Aluno
 */
public class AtividadeMigracaoBancoDados {

    public static void main(String[] args) {
        double [] [] dad = {
            {30, 50, 21, 20},
            {25, 35, 33, 30},
            {82, 26, 23, 14},
            {46, 90, 10, 15}
        };
        
        double [][] fim = new double [4][4];
        
        int i,j;
           for(i=0;i<dad.length;i++)
        {
            for(j=0;j<dad[i].length;j++)
            {
                if(j==0)
                {
                    dad[i][3] = dad [i][3];
                
                if(j==3)
                {
                    dad[i][3] = dad [i][0];
                }
                }
                else{
                    fim[i][j] = dad[i][j];
                }
                System.out.println(fim[i][j]);
            }
        }
    }
}

