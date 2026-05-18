/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademapaatendimento;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMapaAtendimento {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [][] m = new int [3][3];
        int j=0;
        int i = 0;
        int soma = 0;
        int media;
        for (i=0; i < m.length; i++){       
        for (j=0; j < m[i].length; j++)
        {        
        System.out.println("Informe a quantidade de vendas para o setor " + i + " no periodo " + j);
         m[i][j] = leitor.nextInt();
         soma = m[i][j] + soma;
        }
        }
        media = soma/9;
        System.out.print("A soma total sera: " + soma);
        System.out.println(" E a media sera: " + media);
        
    }
}
