/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeacimamedia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAcimaMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double [] notas = new double[5];
        int i;
        double soma = 0;
        for(i=0;i<notas.length;i++)
        {
            System.out.print(" Digite suas notas: ");
            notas[i] = leitor.nextInt();
            soma = soma + notas[i];           
        }
        double media = soma/notas.length;
        
        System.out.println("A media sera: " + media);
        
        for(i=0;i<notas.length;i++)
        {
           if(notas[i]>media)
           {
               System.out.println("Maiores que a media : " + notas[i]);
           }
        }
    }
}
