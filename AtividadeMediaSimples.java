/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademediasimples;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMediaSimples {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota 1");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite a nota 2");
        double nota2 = leitor.nextDouble();
        double média = (nota1 + nota2)/2;
        System.out.print("A media foi: " + média);
        
    }
}
