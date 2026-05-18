/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadechamadosprioridade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeChamadosPrioridade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [3][3];
        int j;
        int i;
        int chamado = 0;
        int sem = 0;
        for (i=0; i < m.length; i++){       
        for (j=0; j < m[i].length; j++)
        {        
        System.out.println("Digite 1 para chamado e 0 para sem chamado");
         m[i][j] = leitor.nextInt();
         if(m[i][j]==1)
         {
             chamado += 1;
         }
         else
         {
             sem += 1;
         }
        }
}
        System.out.print(" A quantidade de chamados e: " + chamado);
        System.out.print(" A quantidade de sem chamados e: " + sem);
    }
}
