/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadelevantamentomultibanco;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeLevantamentoMultibanco {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.print("Insira o valor do saldo atual: ");
         double saldo = leitor.nextDouble();
         System.out.print( " Qual o valor do saque pretendido? ");
         double saque = leitor.nextDouble();
         if(saldo>=saque) System.out.print(" Saque liberado");
         else System.out.print(" Saque negado");
    }
}
