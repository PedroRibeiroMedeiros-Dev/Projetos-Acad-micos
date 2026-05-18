/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeimparpar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeImparPar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = leitor.nextInt();
        if (num%2==0) System.out.print(" o numero e par");
        else System.out.print(" o numero e impar");
                }
}
