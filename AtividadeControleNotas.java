/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecontrolenotas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeControleNotas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        double tN = 0;
        double mN = 0;
        double nota;
        int quantidade = 0;
        do
        {
            System.out.print("Digite a nota: ");
            nota= leitor.nextDouble();
            if (nota!=-1)
            {
                tN = tN + nota;
                media = tN/quantidade;
            if(nota>-1)
            {
                quantidade = quantidade + 1;
            }
            if (nota>mN)
            {
                mN=nota;
            }
            }
        }
         while(nota!=-1) ;
        System.out.print(" A media de notas sera: " + media + " A maior nota foi: " + mN);
    }
}
