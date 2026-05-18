/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademaioridade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMaioridade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         System.out.print("Insira sua idade: ");
         int idade = leitor.nextInt();
         if (idade>=18) System.out.print("Acesso liberado");
         else System.out.print("Acesso negado");
    }
}
