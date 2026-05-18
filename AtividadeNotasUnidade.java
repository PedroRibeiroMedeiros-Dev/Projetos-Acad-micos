/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadenotasunidade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeNotasUnidade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [3][3];
        int j=0;
        int i = 0;
        double [] media = new double[3];
        for (i=0; i < m.length; i++){ 
            int soma = 0;
          soma = m[j][i] + soma;
          
        for (j=0; j < m[i].length; j++)
        {        
        System.out.println("Informe a nota do aluno " + (i+1) + " na prova " + (j+1));
         m[i][j] = leitor.nextInt();
        }
        media[i] = soma/3;
        System.out.print("A media do aluno " + (i+1) + " foi: " + media[i]);        
    }
}
}
