/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademaiornumeroarray;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMaiorNumeroArray {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] num = new double[5];
        int i;
        double maior = 0;
        for (i=0; i<num.length; i++)
        {
        System.out.print(" Digite um numero: ");
        num[i] = leitor.nextDouble();
        if(num[i]>maior)
        {
            maior = num[i];
        }
        }
        System.out.print(" O maior numero sera: " + maior);
    }
}
