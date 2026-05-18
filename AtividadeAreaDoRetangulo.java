/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeareadoretangulo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAreaDoRetangulo {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor da base do terreno: ");
        double base = leitor.nextDouble();
        System.out.print(" Insira o valor da altura do terreno: ");
        double altura = leitor.nextDouble();
       double area = base * altura;
       System.out.print( "A area do terreno será de:" + area);
        
        
    }
}
