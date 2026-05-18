/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeinversordedigitos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeInversorDeDigitos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = leitor.nextInt();
        int num0 = num;
        int inv = 0;
        for (; num != 0; num /= 10)
        {
            int digito = num % 10;
            inv = (inv *10) + digito;
        }
        System.out.print(" Entrada: " + num0 + " Saida: " + inv);
    }
}
