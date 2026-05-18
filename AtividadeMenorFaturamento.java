/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademenorfaturamento;

/**
 *
 * @author Aluno
 */
public class AtividadeMenorFaturamento {

    public static void main(String[] args) {
        int [][] m = {
        {10000, 20000, 30000},
        {40000, 50000, 60000},
        {70000, 80000, 90000} 
    };
        int i,j;
        int maior = m[0][0];
        int menor = m[0][0];
        for(i=0; i < m.length; i++)
        {
            for(j=0; j < m[i].length; j++)
            {
            if(m[i][j]>maior)
            {
            maior = m[i][j];
            }
            else if(m[i][j]<menor)
                menor = m[i][j];
                {
    }
            }
        }
        System.out.print("O menor valor sera: " + menor);
        System.out.print("O menor valor sera: " + maior);
    }
}

