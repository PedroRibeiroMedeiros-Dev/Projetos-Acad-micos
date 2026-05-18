/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeordemcrescente;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeOrdemCrescente {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = leitor.nextInt();
        if (num1>num2) System.out.print(num1 + ", " + num2);
        else System.out.print(num2 + " ," + num1);
    }
}
