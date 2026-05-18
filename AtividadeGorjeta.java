/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadegorjeta;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeGorjeta {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da conta: ");
        double conta = leitor.nextDouble();
        double gorjeta = conta * 0.10;
        System.out.print(" A gorjeta do garcom sera de:" + gorjeta + " reais");
       
        
    }
}
