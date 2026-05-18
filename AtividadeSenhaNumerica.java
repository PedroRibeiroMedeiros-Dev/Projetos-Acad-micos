/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesenhanumerica;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSenhaNumerica {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.print("Insira a senha: ");
         int senha = leitor.nextInt();
         if(senha==1234) System.out.print("Acesso liberado");
         else System.out.print("Acesso negado");
    }
}
