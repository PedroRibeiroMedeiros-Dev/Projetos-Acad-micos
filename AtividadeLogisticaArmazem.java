/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadelogisticaarmazem;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeLogisticaArmazem {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double [] [] arm = {
            {15, 10, 12, 16, 14},
            {10, 7, 5, 20, 15},
            {0, 0, 10, 32, 12}          
        };
        int i,j;
        for(i=0;i<arm.length;i++)
        {
            double soma = 0;
            for(j=0;j<arm[i].length;j++)
            {
                soma = soma + arm[i][j];
            }
            System.out.println("A soma do corredor " + (i+1) + " e igual a: " + soma);
        }

    }
}
