/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesalariosimples;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSalarioSimples {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.println("Insira seu salario por hora: ");
         double sph = leitor.nextDouble();
         System.out.print( " insira quantas horas foram de trabalho: " + "h");
         double hmt = leitor.nextDouble();
         double ss = sph * hmt;
         System.out.print( "O salario parcial sera de:" + ss + " reais");
                 
         
         
        
    }
}
