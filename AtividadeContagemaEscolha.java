/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecontagemaescolha;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeContagemaEscolha {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("Digite o numero o qual voce deseja a contagem: ");
       int num = leitor.nextInt();
       for ( int i = 1; i<=num; i++)
       {
           System.out.println(i);
       }
    }
}
